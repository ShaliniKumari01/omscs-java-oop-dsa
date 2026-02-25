# OMSCS Java OOP + Data Structures Mini-Library

A small Maven-based Java project demonstrating:
- OOP fundamentals (inheritance, abstraction, interfaces)
- Data structures (Stack, Queue, LinkedList)
- DSA practice (recursion, searching, sorting)
- Unit testing with JUnit 5
- Basic algorithmic reasoning (Big-O time/space)

## How to Run

### Run tests
mvn -q test

### Run specific test
mvn -q -Dtest=FactorialRecursiveTest,PowerFastTest test

### Run OOP demo
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

Recursion

FactorialRecursive → O(n) time, O(n) stack
PowerFast (exponentiation by squaring) → O(log n) time, O(log n) stack


Search

linear search: O(n) time, O(1) space
binary search: O(log n) time, O(1) space
invariant for binary: “if target exists, it’s within [lo, hi]”

Sorting

bubble: best O(n) (already sorted), avg/worst O(n²), space O(1)
insertion: best O(n), worst O(n²), space O(1)



## Project Structure
- src/main/java/oop → OOP models (Account, SavingsAccount, CheckingAccount)
- src/main/java/ds  → Data structures (MyStack, MyQueue, MyLinkedList)
- src/main/java/recursion →  Recursion algorithms (FactorialRecursive, PowerFast)
- src/main/java/search →  Search algorithms (LinearSearch,BinarySearch)
- src/main/java/sort →  Sorting algorithms (BubbleSort,InsertionSort)
- src/test/java     → JUnit tests
- src/main/java/app → Demo runner (Main)


