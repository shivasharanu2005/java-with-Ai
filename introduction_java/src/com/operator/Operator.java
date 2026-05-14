package com.operator;

public class Operator {
	public static void main(String[] args) {
                int a = 10, b = 5;

                // 1. Arithmetic Operators
                System.out.println("Arithmetic Operators");
                System.out.println("Addition: " + (a + b));
                System.out.println("Subtraction: " + (a - b));
                System.out.println("Multiplication: " + (a * b));
                System.out.println("Division: " + (a / b));
                System.out.println("Modulus: " + (a % b));

                // 2. Logical Operators
                System.out.println("\nLogical Operators");
                boolean x = true, y = false;
                System.out.println("AND (&&): " + (x && y));
                System.out.println("OR (||): " + (x || y));
                System.out.println("NOT (!): " + (!x));

                // 3. Bitwise Operators
                System.out.println("\nBitwise Operators");
                System.out.println("Bitwise AND (&): " + (a & b));
                System.out.println("Bitwise OR (|): " + (a | b));
                System.out.println("Bitwise NOT (~): " + (~a));

                // 4. Assignment Operators
                System.out.println("\nAssignment Operators");
                int c = 20;
                c += 5;
                System.out.println("+= : " + c);

                c -= 3;
                System.out.println("-= : " + c);

                c /= 2;
                System.out.println("/= : " + c);

                // 5. Relational Operators
                System.out.println("\nRelational Operators");
                System.out.println("a > b : " + (a > b));
                System.out.println("a < b : " + (a < b));
                System.out.println("a >= b : " + (a >= b));
                System.out.println("a <= b : " + (a <= b));
                System.out.println("a == b : " + (a == b));

                // 6. Ternary Operator
                System.out.println("\nTernary Operator");
                int max = (a > b) ? a : b;
                System.out.println("Maximum value: " + max);

                // 7. Unary Operators
                System.out.println("\nUnary Operators");
                int d = 5;
                System.out.println("Original value: " + d);

                d++;
                System.out.println("After Increment (++): " + d);

                d--;
                System.out.println("After Decrement (--): " + d);
            }
        
	}

