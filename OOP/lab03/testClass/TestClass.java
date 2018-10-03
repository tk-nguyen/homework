package testClass;

import lab03.tenClasses.*;
import lab03.exercises.*;

public class TestClass {

    public static void main(String[] args) 
    {
        GCD testGCD = new GCD();
        System.out.println(testGCD.GCD(-15, 5));
        
        Fractions first = new Fractions(2, -3);
        Fractions second = new Fractions(-2, 3);
        
        
        first.add(second);
        first.minus(second);
        first.multiply(second);
        first.divide(second);
        
        System.out.println(first.equals(second));
        System.out.println(first.equals("aaa"));
    }

}
