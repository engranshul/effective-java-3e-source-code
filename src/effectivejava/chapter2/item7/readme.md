### eliminate obsolete object references
* If you switched from a language with manual memory management, such as C or
  C++, to a garbage-collected language such as Java, your job as a programmer was
  made much easier by the fact that your objects are automatically reclaimed when
  you’re through with them. It seems almost like magic when you first experience it.
  It can easily lead to the impression that you don’t have to think about memory
  management, but this isn’t quite true.
* Memory leaks in garbage-collected languages (more properly known as unintentional
  object retentions) are insidious. If an object reference is unintentionally
  retained, not only is that object excluded from garbage collection, but so too are
  any objects referenced by that object, and so on. Even if only a few object references
  are unintentionally retained, many, many objects may be prevented from
  being garbage collected, with potentially large effects on performance.
 
  The fix for this sort of problem is simple: null out references once they
  become obsolete. In the case of our Stack class, the reference to an item becomes
  obsolete as soon as it’s popped off the stack. The corrected version of the pop
  method looks like this:
  
  public Object pop() {
  if (size == 0)
  throw new EmptyStackException();
  Object result = elements[--size];
  elements[size] = null; // Eliminate obsolete reference
  return result;
  }
* When programmers are first stung by this problem, they may overcompensate
  by nulling out every object reference as soon as the program is finished using it.
  This is neither necessary nor desirable; it clutters up the program unnecessarily.
  Nulling out object references should be the exception rather than the norm.
  The best way to eliminate an obsolete reference is to let the variable that contained
  the reference fall out of scope. This occurs naturally if you define each variable in
  the narrowest possible scope

#### when shd u null out a reference
* whenever a class manages its own memory, the programmer
  should be alert for memory leaks. Whenever an element is freed, 
  any object references contained in the element should be
  nulled out. 
* Another common source of memory leaks is caches. Once you put an
  object reference into a cache, it’s easy to forget that it’s there and leave it in the
  cache long after it becomes irrelevant. There are several solutions to this problem.
  If you’re lucky enough to implement a cache for which an entry is relevant exactly
  so long as there are references to its key outside of the cache, represent the cache
  as a WeakHashMap; entries will be removed automatically after they become
  obsolete. Remember that WeakHashMap is useful only if the desired lifetime of
  cache entries is determined by external references to the key, not the value.      
* A third common source of memory leaks is listeners and other callbacks.
  If you implement an API where clients register callbacks but don’t deregister them
  explicitly, they will accumulate unless you take some action. One way to ensure
  that callbacks are garbage collected promptly is to store only weak references to
  them, for instance, by storing them only as keys in a WeakHashMap.
  
  https://stackoverflow.com/questions/2859464/how-to-avoid-memory-leaks-in-callback
  
    
### hashmap vs weakhashmap
* https://www.geeksforgeeks.org/hashmap-vs-weakhashmap-java/  