package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        final double pi = 3.14;
        double cat1 = 0, cat2;
        cat1 = readValue(cat1);
        cat2 = cat1;


        System.out.print("Длина второго катета = ");
        showInfo(cat2);

        double c = calcHypot(cat1,cat2);
        System.out.printf("Длина гипотенузы = %1$.2f ", c);
        System.out.println();

        double r = calcRadius(c);
        System.out.printf("Радиус окружности равен = %1$.2f ", r);
        System.out.println();

        double s1 = calcAreaCircle(r);
        System.out.printf("Для круга R = %1$.2f площадь s = %2$.2f%n",r,s1 );


        double side = calcSideSquare(r);
        System.out.printf("Сторона квдрата = %1$.2f\n", side);

        double s2 = calcAreaSauqre(side);
        System.out.printf("Площадь квдрата = %1$.2f%n", s2);

        double diffAreas = areaPaintedPart(s1,s2);
        System.out.printf("Плоащдь закрашенной части = %1$.2f", diffAreas);

    }

    static double readValue(double cat1){
        Scanner num = new Scanner(System.in);
        System.out.println("Введите длину катета ");
        cat1 = num.nextDouble();
        return cat1;
    }

    static double calcHypot (double cat1, double cat2)
    {
        return Math.sqrt(cat1 * cat1 + cat2 * cat2);
    }

    static void showInfo( double a) {
        System.out.println(a);
    }

    static double calcRadius(double c)
    {
        return c/2;
    }

    static double calcAreaCircle(double r)
    {
        return 3.14 * r * r;
    }

    static double calcSideSquare ( double r){
        return 2 * r;
    }

    static double calcAreaSauqre (double side){
        return side * side;
    }

    static double areaPaintedPart( double s1, double s2){
        return s2 - s1;
    }
}
