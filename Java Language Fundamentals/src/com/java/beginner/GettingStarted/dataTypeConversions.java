package com.java.beginner.GettingStarted;

public class dataTypeConversions {
    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = (short) longVal;
        short result2 = (short) (byteVal - longVal);
        float resilt3 = longVal - floatVal;

        System.out.println("Success");
        System.out.println(result1 + " " + result2 + " " + resilt3);
    }
}
