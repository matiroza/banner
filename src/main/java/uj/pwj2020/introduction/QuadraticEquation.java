package uj.pwj2020.introduction;

import java.lang.reflect.Array;

public class QuadraticEquation {

    public double[] findRoots(double a, double b, double c) {
        double delta = b*b-4*a*c;
        if (delta<0) {
            return new double[] { };
        } else if (delta == 0) {
            return new double[] { -b / ( 2*a ) };
        } else{
            return new double[] { (-b - Math.sqrt(delta)) / (2*a) , (-b + Math.sqrt(delta) ) / (2*a) };
        }
    }

}

