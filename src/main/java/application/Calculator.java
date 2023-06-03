package application;

public class Calculator {



    //***************Simple methods************************

    public int add(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public double multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        return a / b;
    }

    public double squareRoot(int a) {
        return Math.sqrt(a);
    }

    public double x2(int a) {
        return Math.pow(a, 2);
    }


    public double averageValue(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }

    public boolean isEven(int a) {
        return a % 2 == 0;
    }

    public int biggerInt(int a, int b) {
        if (a < b) {
            return b;

        } else if (a > b) {
            return a;

        } else {
            return 0;
        }
    }

    public long sumOfIntegers(int... args) {
        long result = 0L;
        for (int arg : args) {
            result = result + arg;
        }
        return result;
    }

    public long checkDivideByZerro(int a, int b) {
        if (b == 0) {
            return -100;
        } else {
            return a / b;
        }
    }


    //***************Medium methods************************


    //TODO (*) |even or odd| add method which get 1 number as parameter and return true if it even, and false - if odd

    //TODO (*) |biggest value| add method which get 2 number as parameters and return bigger of them, or 0 if they equals

    //***************Hard methods************************

    //TODO (**) |addition with multiple parameters| add method which return sum of any quantity of parameter

    //TODO (*) |divide by zero case| add method for division (check division by zero case
    // - if we try to divide by zero - return -100;


}







