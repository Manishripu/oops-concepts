# Object-Oriented Programming (OOP) - Revision Notes

## Overview
[cite_start]Object-Oriented Programming (OOP) is essentially a way of organizing your code to model the real world[cite: 2]. [cite_start]Instead of just writing a long list of top-to-bottom instructions, OOP lets you bundle related data and behaviors into neat little packages called Objects[cite: 3].

---

## 1. The Building Blocks: Classes and Objects

* [cite_start]**Class:** Think of a class as a blueprint or a cookie cutter[cite: 5]. [cite_start]It defines the structure, properties, and behaviors that an object will have, but it doesn't represent a specific thing itself[cite: 6].
* [cite_start]**Object:** An object is the actual instance created from the class blueprint[cite: 8]. [cite_start]It is the physical cookie made from the cutter[cite: 9].

### 🛠️ Practice Task:
1. Create a `Book` class with properties for `Title`, `Author`, and `PageCount`.
2. Instantiate (create) two different `Book` objects with your favorite titles.
3. Write a method inside the class called `Read()` that prints "Reading [Title] by [Author]...".

---

## 2. The Four Pillars of OOP

### Pillar 1: Encapsulation (Hiding the Inner Workings)
[cite_start]Encapsulation is the practice of bundling data (attributes) and the methods (functions) that operate on that data into a single unit, usually a class[cite: 10]. [cite_start]More importantly, it restricts direct access to some of an object's components[cite: 11].
* [cite_start]**Why it's useful:** It protects data from accidental corruption and makes code easier to maintain because the internal mechanics are hidden behind a simple interface[cite: 14].

**🛠️ Practice Task:**
Create a `BankAccount` class. Make the `balance` property private (hidden) so it can't be changed directly from outside the class. Create public methods `Deposit(amount)` and `Withdraw(amount)` to safely modify the balance.

### Pillar 2: Abstraction (Keeping it Simple)
[cite_start]Abstraction means showing only the essential features of an object to the outside world and hiding the complex background details[cite: 16].
* [cite_start]**Why it's useful:** It reduces complexity and effort, allowing you to use complex systems without needing to understand every gear inside them[cite: 20].

**🛠️ Practice Task:**
Create an `EmailService` class with a simple public method `SendEmail(to, message)`. Inside that class, create private, hidden methods for things the user doesn't need to see, like `ConnectToServer()`, `Authenticate()`, and `Disconnect()`.

### Pillar 3: Inheritance (Reusing Code)
[cite_start]Inheritance allows a new class (a "child" or "derived" class) to inherit properties and methods from an existing class (a "parent" or "base" class)[cite: 21].
* [cite_start]**Why it's useful:** It prevents code duplication and establishes logical relationships between objects[cite: 26].

**🛠️ Practice Task:**
1. Create a base class called `Vehicle` with properties like `Speed` and a method `StartEngine()`.
2. Create two child classes: `Car` and `Motorcycle` that inherit from `Vehicle`.
3. Give `Car` a unique property like `NumberOfDoors` and `Motorcycle` a unique property like `HasSidecar`.

### Pillar 4: Polymorphism (Many Forms)
[cite_start]Polymorphism allows objects of different classes to be treated as objects of a common base class[cite: 27]. [cite_start]More specifically, it allows the same method name to execute different behaviors depending on the specific object calling it[cite: 28].

**🛠️ Practice Task:**
1. Create a base class `Shape` with a method `CalculateArea()`.
2. Create child classes `Circle` and `Rectangle`.
3. Override the `CalculateArea()` method in both child classes to use their specific math formulas (e.g., $A = \pi r^2$ for Circle, $A = w \times h$ for Rectangle).
4. Create a list of different shapes and loop through them, calling `CalculateArea()` on each to see the different results.