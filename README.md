# Core Java Projects

A collection of modular console applications built in Core Java (JDK 21) demonstrating Object-Oriented Programming, custom exception handling, input validation, and clean package architecture.

## Featured Projects

### 1. Student Management System (`studentmanagement/`)
An interactive console application for managing student records using encapsulated objects and array-based CRUD operations.
- **Concepts:** Classes, Constructors, Encapsulation (selective read-only fields), Validation, Search & Update workflows.
- **Highlights:** Enforces strict CGPA boundaries (`0.00` to `10.00`), prevents `NullPointerException` on unoccupied array slots, and computes academic standing (`Distinction`, `First Class`, `Pass`).

### 2. Crash-Proof ATM Simulator (`exceptionhandling/`)
A fault-tolerant banking menu application designed to recover gracefully from invalid inputs and business-rule violations.
- **Concepts:** `try-catch-finally`, Checked vs. Unchecked Exceptions, Custom Exceptions (`InsufficientFundsException`), Separation of Concerns.
- **Highlights:** Handles `InputMismatchException` with `Scanner` buffer recovery (eliminating infinite input loops) and throws domain-specific exceptions from the account layer.

### 3. Polymorphic Payment Gateway (`polymorphism/`)
A payment processing simulator modeling Indian payment modes (UPI and Credit Cards) through runtime polymorphism.
- **Concepts:** Inheritance, Method Overloading, Method Overriding (`@Override`), Polymorphic Object Arrays.
- **Highlights:** Processes mixed `UpiPayment` (zero fee) and `CreditCardPayment` (2% convenience fee) transactions dynamically through a single `Payment[]` array loop.

### 4. Foundational OOP & Logic Modules (`Day1.java` – `Day4/`)
- **`Day4/` (Inheritance):** `BankAccount` and `SavingsAccount` hierarchy with automated interest calculation.
- **`Day3/` (Encapsulation):** `Book` and `Library` system with constructor validation and discount calculation.
- **`Day2/` (Control Flow & Arrays):** Interactive Terminal Calculator, Weekly Expense Analyzer, Loan Simulator, and Mini Wallet Tracker.

## How to Run Locally

**Prerequisites:** JDK 17+ installed (`java -version`).

Clone the repository and run any project from the root directory:

```bash
git clone [https://github.com/pugal16-dev/core-java-projects.git](https://github.com/pugal16-dev/core-java-projects.git)
cd core-java-projects

# Run Student Management System
javac studentmanagement/*.java
java studentmanagement.StudentManagerApp

# Run Crash-Proof ATM Simulator
javac exceptionhandling/*.java
java exceptionhandling.AtmApp

# Run Polymorphic Payment Gateway
javac polymorphism/*.java
java polymorphism.PaymentApp
```