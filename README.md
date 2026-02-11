# omscs-java-oop-dsa
Java OOP + data structures mini-library (Maven)
## Sample Run (OOP Demo)

Command:
mvn -q exec:java -Dexec.mainClass=app.Main

Output:
=== Before monthlyUpdate ===
Savings balance: 1000.0
Checking balance: 500.0

=== After monthlyUpdate ===
Savings balance: 1010.0
Checking balance: 490.0

## Data Structures Implemented
- MyStack<T>: push/pop/peek are O(1)

- MyQueue<T>: enqueue/dequeue/peek are O(1)

- MyLinkedList<T>: add (end) O(1), addFirst O(1), get(index) O(n), removeFirst O(1)

## Complexity Notes (Big-O)
| Structure | Operation | Time |
|---|---|---|
| MyStack | push/pop/peek | O(1) |
| MyQueue | enqueue/dequeue/peek | O(1) |
| MyLinkedList | add(end) / addFirst / removeFirst | O(1) |
| MyLinkedList | get(index) | O(n) |
