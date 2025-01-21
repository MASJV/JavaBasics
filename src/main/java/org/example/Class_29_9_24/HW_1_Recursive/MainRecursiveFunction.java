package org.example.Class_29_9_24.HW_1_Recursive;

public class MainRecursiveFunction {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}