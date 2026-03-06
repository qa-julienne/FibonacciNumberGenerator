
# Fibonacci Sequence Generator (Java)

A simple Java console application that generates and prints the **Fibonacci sequence** based on the number of terms entered by the user.

## Description

This program prompts the user to enter how many terms of the Fibonacci sequence they want to generate. It then calculates and prints the sequence starting from **0 and 1**.

The Fibonacci sequence is a series where each number is the **sum of the two preceding numbers**.

Example sequence:

0, 1, 1, 2, 3, 5, 8, 13, 21, ...

## How the Program Works

1. The program prompts the user to enter the number of terms.
2. It reads the input using the `Scanner` class.
3. The first two numbers of the sequence are initialized:

   * `a = 0`
   * `b = 1`
4. A `for` loop runs for the number of terms entered.
5. In each iteration:

   * The current number (`a`) is printed.
   * The next number is calculated using `nextNum = a + b`.
   * Values are updated for the next iteration.

## Example Output

Enter the number of terms in the fibonacci series:
5

Fibonacci Sequence:
0
1
1
2
3

## Technologies Used

* Java
* `java.util.Scanner`
* For Loop

## Project Structure

day6/
└── Fibonacci.java

## How to Run the Program

### 1. Compile the Program

```bash
javac day6/Fibonacci.java
```

### 2. Run the Program

```bash
java day6.Fibonacci
```

### 3. Enter Number of Terms

The program will ask how many Fibonacci numbers you want to generate.

## Learning Objectives

This project helps beginners understand:

* Java input handling with `Scanner`
* Loop structures (`for` loop)
* Variable updates and swapping
* Basic algorithm implementation

