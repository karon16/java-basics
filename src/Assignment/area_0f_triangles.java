package Assignment;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class area_0f_triangles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will calculate the area of the triangle. ");
        System.out.println("Please, enter A side of a triangle: ");
        double aSide = sc.nextDouble();

        System.out.println("Please, enter B side of a triangle: ");
        double bSide = sc.nextDouble();

        System.out.println("Please, enter C side of a triangle: ");
        double cSide = sc.nextDouble();

        double p = (aSide + bSide + cSide) / 2;
        double triangleArea = Math.sqrt(p * (p - aSide));
        System.out.println("Area of triangle is: " + triangleArea);


    }
}