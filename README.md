# OMSCS Java OOP + Data Structures Mini-Library

A small Maven-based Java project demonstrating:
- OOP fundamentals (inheritance, abstraction, interfaces)
- Data structures (Stack, Queue, LinkedList)
- Unit testing with JUnit 5

## How to Run

### Run tests
mvn -q test

### Run demo
mvn -q exec:java -Dexec.mainClass=app.Main

## Sample Run (OOP Demo)
=== Before monthlyUpdate ===
Savings balance: 1000.0
Checking balance: 500.0

=== After monthlyUpdate ===
Savings balance: 1010.0
Checking balance: 490.0

## Data Structures Implemented
- MyStack<T>: push/pop/peek are O(1)
- MyQueue<T>: enqueue/dequeue/peek are O(1)
- MyLinkedList<T>: add(end) O(1), addFirst O(1), removeFirst O(1), get(index) O(n)

## Project Structure
- src/main/java/oop → OOP models (Account, SavingsAccount, CheckingAccount)
- src/main/java/ds  → Data structures (MyStack, MyQueue, MyLinkedList)
- src/test/java     → JUnit tests
- src/main/java/app → Demo runner (Main)
