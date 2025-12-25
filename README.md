# 🔁 Java Algorithms: Function Recursion (FR)

This repository contains a collection of fundamental algorithms implemented in Java using **Function Recursion**. Recursion is a powerful programming technique where a function calls itself to solve a smaller instance of the same problem, continuing until a simple base case is met.

Each file demonstrates how to break down complex problems into repetitive, self-similar sub-problems, illustrating the elegance and efficiency of recursive solutions.

---

## 📋 Table of Contents

* [Mathematical Calculations (Recursion)](#-mathematical-calculations-recursion)
* [Digit and Number Manipulation (Recursion)](#-digit-and-number-manipulation-recursion)
* [Series and Sequence Generation (Recursion)](#-series-and-sequence-generation-recursion)
* [Getting Started](#-getting-started)

---

## 🔢 Mathematical Calculations (Recursion)

This section focuses on using recursion to solve classic mathematical problems.

### Key Concepts
* **Base Case:** The termination condition that stops the recursive calls (e.g., when the number reaches 0 or 1).
* **Recursive Step:** The step where the function calls itself with a modified input (e.g., $n-1$).

| File Name | Description |
| :--- | :--- |
| `Cal_Factorial_of_No_FR.java` | Calculates the **Factorial** of a number ($n!$) recursively. |
| `Cal_Pow_No_FR.java` | Calculates the **Power** of a number ($base^{exponent}$) recursively. |
| `Find_GCD_2_No_FR.java` | Finds the **Greatest Common Divisor (GCD)** of two numbers using the Euclidean algorithm, implemented recursively. |

---

## 🧠 Digit and Number Manipulation (Recursion)

These programs demonstrate the use of recursion to manipulate and analyze the individual digits of a number.

### Key Concepts
* **Modulus and Division:** Using the `% 10` (modulus) operator to get the last digit and the `/ 10` (division) operator to remove it, enabling recursive calls on the remaining digits.

| File Name | Description |
| :--- | :--- |
| `Cal_Sum_of_Digit_FR.java` | Calculates the **Sum of the Digits** of a number recursively. |
| `Cal_Prod_of_Digit_FR.java` | Calculates the **Product of the Digits** of a number recursively. |
| `Count_No_of_Digit_FR.java` | **Counts the total number of digits** in a number recursively. |
| `Check_No_Palindrom_FR.java` | Checks if a number is a **Palindrome** using a recursive approach. |
| `Reverse_No_FR.java` | **Reverses the digits** of a given number recursively. |

---

## 📈 Series and Sequence Generation (Recursion)

This section contains recursive solutions for generating sequences and calculating sums over a range.

### Key Concepts
* **Backtracking:** The process of a function returning to its caller, often used here for sequential printing.
* **Accumulation:** Using the return values from recursive calls to build a final sum or sequence.

| File Name | Description |
| :--- | :--- |
| `Sum_N_Natural_No_FR.java` | Calculates the **Sum of the first N Natural Numbers** recursively. |
| `Cal_Sum_of_Even_No_FR.java` | Calculates the **Sum of all Even Numbers** up to N recursively. |
| `Print_1_To_N_FR.java` | Prints numbers sequentially **from 1 up to N** recursively. |
| `Print_N_To_1_FR.java` | Prints numbers sequentially **from N down to 1** recursively. |

---

## 💻 Getting Started

### Prerequisites
* **Java Development Kit (JDK 8+)** installed.

### Running the Code
1.  Clone this repository:
    ```bash
    git clone [Your Repository URL]
    cd [repository-name]
    ```
2.  Compile any Java source file (e.g., for `Cal_Factorial_of_No_FR.java`):
    ```bash
    javac Cal_Factorial_of_No_FR.java
    ```
3.  Execute the compiled class:
    ```bash
    java Cal_Factorial_of_No_FR
    ```
