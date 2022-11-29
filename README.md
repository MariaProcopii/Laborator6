# Laborator6

Code smells are a result of poor or misguided programming. These blips in the application code can often be directly 
traced to mistakes made by the application programmer during the coding process.

Smells are certain structures in the code that indicate violation of fundamental design principles and negatively impact
design quality. in order to fix that, I applied SOLID principles and architecural patterns.

The goal of the SOLID principles is to reduce dependencies so that we can change one area of software without impacting others.
Additionally, they’re intended to make designs easier to understand, maintain, and extend. Ultimately, using these design 
principles makes it easier for software engineers to avoid issues and to build adaptive, effective, and agile software.

I order to apply these principles, I splitted every class in three classes to put the data logic and gesign related entities appart.
The Controller is the boumding part of the process. It traks the changes the data in moule and updates view when needed.

Regarding the part of SOLID implementation. I checked my classes for:

1) being responsible only for 1 task or functionality and when there is a change in that 
   task/functionality, only then, that class should change. (Single Responsibility Principle)
   
2) being extendable without modifying the class itself. (Open-Closed Principle)
 
3) any class that is the child of a parent class should be usable in place of its parent without 
   any unexpected behavior. (Liskov Substitution Principle)

4) avoiding fat interface and give preference to many small client-specific interfaces. (Interface Segregation Principle)

5) not depend on low level modules, but from abstractions. (Dependency Inversion Principle)
