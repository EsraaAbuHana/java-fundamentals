#  Inheritance and Interfaces
## Overview Of The Architecture Of This Library :
***This library includes :***
   - interface :NewReview
   - Classes:
     - Review class.
     - Place superclass that implements NewReview.
     - Subclasses of Place:
       - Restaurant
       - Shop
       - Theater
  
- Visual Structure  :
```
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── inheritance
│       │   │       ├── Library.java
│       │   │       ├── NewReview.java
│       │   │       ├── Place.java
│       │   │       ├── Restaurant.java
│       │   │       ├── Review.java
│       │   │       ├── Shop.java
│       │   │       └── Theater.java
│       │   └── resources
│       └── test
│           ├── java
│           │   └── inheritance
│           │       └── LibraryTest.java
```

## Test

For test this library  run  `./gradlew test` in the terminal .
