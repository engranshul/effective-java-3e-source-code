### Avoid finalizers and cleaners

* what are finalizers
  The finalize method provided by the root Object class.
  Simply put, this is called before the garbage collection 
  for a particular object.The main purpose of a finalizer is,
  however, to release resources used by objects before they're 
  removed from the memory. A finalizer can work as the primary 
  mechanism for clean-up operations, or as a safety net when 
  other methods fail.
  One shortcoming of finalizers and cleaners is that there is no guarantee they’ll
  be executed promptly.It can take arbitrarily long between the time
  that an object becomes unreachable and the time its finalizer or cleaner runs. This
  means that you should never do anything time-critical in a finalizer or cleaner.
  For example, it is a grave error to depend on a finalizer or cleaner to close files
  because open file descriptors are a limited resource. If many files are left open as a
  result of the system’s tardiness in running finalizers or cleaners, a program may
  fail because it can no longer open files.The promptness with which finalizers and 
  cleaners are executed is primarily a function of the garbage collection 
  algorithm, which varies widely across implementations.
* Tardy finalization is not just a theoretical problem. Providing a finalizer for a
  class can arbitrarily delay reclamation of its instances. A colleague debugged a
  long-running GUI application that was mysteriously dying with an
  OutOfMemoryError. Analysis revealed that at the time of its death, the application
  had thousands of graphics objects on its finalizer queue just waiting to be finalized
  and reclaimed. Unfortunately, the finalizer thread was running at a lower priority
  than another application thread, so objects weren’t getting finalized at the rate
  they became eligible for finalization. The language specification makes no guar-
  antees as to which thread will execute finalizers, so there is no portable way to
  prevent this sort of problem other than to refrain from using finalizers. Cleaners
  are a bit better than finalizers in this regard because class authors have control
  over their own cleaner threads, but cleaners still run in the background, under the
  control of the garbage collector, so there can be no guarantee of prompt cleaning.  
* Blunders : depending on a finalizer or cleaner to release a persistent lock on a 
  shared resource such as a database is a good way to bring your entire distributed 
  system to a grinding halt.  
  
* So what should you do instead of writing a finalizer or cleaner for a class
  whose objects encapsulate resources that require termination, such as files or
  threads?
  Just have your class implement AutoCloseable, and require its clients
  to invoke the close method on each instance when it is no longer needed,
  typically using try-with-resources to ensure termination even in the face of
  exceptions. One detail worth mentioning is that the instance must keep
  track of whether it has been closed: the close method must record in a field that
  the object is no longer valid, and other methods must check this field and throw an
  IllegalStateException if they are called after the object has been closed. 
  
* In summary, don’t use cleaners, or in releases prior to Java 9, finalizers,
  except as a safety net or to terminate noncritical native resources. Even then,
  beware the indeterminacy and performance consequences.
  More on try with resources : https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html  
        
  