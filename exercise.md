Java Training Practice Exercises You may complete this while still learning from the videos. The output must be a Github link. The folder structure must be like this:
```
java_exercise_1
java_exercise_2
java_exercise_3
java_exercise_4
java_exercise_5
```

1. Working with arrays
    1. Create a Java method that finds two neighboring numbers in an array with the smallest distance to each other. The function should return the index of the first number.
    2. In the sequence 4 8 6 1 2 9 4 the minimum distance is 1 (between 1 and 2). The function should return the index 3 (of number 1).
    3. In case of two different sets with the smallest and same distance, return the index of the first smallest distance set. In the sequence 1 2 3 5 8 20 the minimum distance is 1 (between 1 and 2 & between 2 and 3). The function should return the index 0 (of number 1).
    4. Hint: Use Math.abs() to calculate the distance of two numbers.

    
2. Designing Objects: Chemical Element
    a. The periodic table of chemical elements classifies and displays all chemical elements. Each chemical element has a unique symbolic name and atomic number (number of protons). Chemical elements are grouped together by common characteristics (alkali metal, poor metal, ...) called the chemical series.
    b. Examples of chemical elements:

        * H (hydrogenium): Hydrogen with atomic number 1.
        * O (oxygenium): Oxygen with atomic number 8.
        * K: Potassium with atomic number 19. It is an alkali metal.
        * Zn: Zinc (from german Zink) with atomic number 30. It is a transition metal.
        * Ga: Gallium with atomic number 31. It is a metal.

    c. We consider the following chemical series:

        * Alkali metals are all chemical element with atomic number 3, 11, 19, 37, 55, or 87
        * Transition metals are all chemical elements with atomic numbers from 21 to 30, 39 to 48, 72 to 80, and 104 to 112.
        * Metals are all chemical elements with atomic number 31, 49, 50, 81, 82, 83, 113, 114, 115, or 116.

    d. Design and implement a class ChemicalElement. The class should contain methods to retrieve for a chemical element its name, symbolic name, atomic number, and which type of metal it is (three different methods for each metal property). Implement these three methods without if or else, but:

        * one method with a switch
        * one method with a single boolean expression
        * one method with a static boolean-‐array where the index is the atomic number.

    e. The values of a chemical element must be immutable: once a chemical element is constructed, it must not be possible to change its internal state.


3. Implementing Interface
    1. You must implement an interface which is defined in the java.util package called Enumeration. The purpose of your Enumeration implementation is to enumerate the characters within a String to which the Enumeration implementation is currently working on.
    2. Here is an example to give you an idea of how it will behave.
    3. This should produce the output:

```
H
e
l
l
o

W
o
r
l
d
!
```

4. Perfect Number.

* A perfect number is a positive integer that is equal to the sum of its proper positive divisors, that is, the sum of its positive divisors excluding the number itself (also known as its aliquot sum). Equivalently, a perfect number is a number that is half the sum of all of its positive divisors (including itself).
* For Example:
    * 6 is a perfect number because 1+2+3 = 6 and (1+2+3+6)/2 = 6



5. Shapes
    1. A “Shape” can be “Rectangle”, “Circle” or “Triangle”.
    2. Create 2 methods for each shape to compute for “area” and “perimeter” respectively.
    3. Create 2 methods that compute the total area and perimeter of a list of “Shape” (assuming the shapes are not overlapping). The list of “Shapes” can include “Rectangle”, “Circle” or “Triangle”.
    4. Create a method that returns the shape with the largest area.
    5. Hint: Use polymorphism approach.

