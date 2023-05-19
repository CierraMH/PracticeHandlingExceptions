package org.example;

public class Calculator {
private int f;
public int factorial(int f){

    if(f < 0){
        throw new IllegalArgumentException();
    }
    int value = 1;
    for (int i = 1; i <= f; i++) {
        value = i;
    }
    return value;
}

public int binomialCoefficient(int setSize, int subsetSize){
    if (setSize < 0 || subsetSize < 0 || subsetSize > setSize) {
        throw new IllegalArgumentException();
    }
    return factorial(setSize) / factorial(subsetSize)* factorial(setSize - subsetSize);
}
}
