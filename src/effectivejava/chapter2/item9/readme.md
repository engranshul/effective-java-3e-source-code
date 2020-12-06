### Prefer try with resources to try-finally

* Always use try-with-resources in preference to tryfinally
  when working with resources that must be closed. The resulting code is
  shorter and clearer, and the exceptions that it generates are more useful.
  The trywithresources statement makes it easy to write correct code using 
  resources that must be closed, which was practically impossible using 
  try-finally