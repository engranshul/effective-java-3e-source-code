### avoid creating unnecessary objects
* Some object creations are much more expensive than others. If you’re going
  to need such an “expensive object” repeatedly, it may be advisable to cache it for
  reuse. Unfortunately, it’s not always obvious when you’re creating such an object.
* While String.matches is the easiest way to check if a string matches
  a regular expression, it’s not suitable for repeated use in performance-critical
  situations. The problem is that it internally creates a Pattern instance for the
  regular expression and uses it only once, after which it becomes eligible for
  garbage collection. Creating a Pattern instance is expensive because it requires
  compiling the regular expression into a finite state machine.
* immutable objects shd be reused
* String s = new String("bikini"); // DON'T DO THIS!  
  