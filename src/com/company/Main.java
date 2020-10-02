package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        double cat1 = readValue();
        double cat2 = calcCat2(cat1);

        logic(cat1,cat2);
    }


    static double readValue() {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите длину катета ");
        return num.nextDouble();
    }

    static double calcCat2(double cat1) {
        double cat2 = cat1;
        System.out.printf(" Длина второго катета = %1$.2f%n", cat2);
        return cat2;
    }

    static double calcHypot(double cat1, double cat2) {
        double c = Math.sqrt(cat1 * cat1 + cat2 * cat2);
        System.out.printf("Длина гипотенузы = %1$.2f ", c);
        return c;
    }

    static double calcRadius(double c) {
        double r = c/2;
        System.out.printf("Радиус окружности равен = %1$.2f ", r);
        return r;
    }

    static double calcAreaCircle(double r) {
        double s1 = Math.PI * r * r;
        System.out.printf("Для круга R = %1$.2f площадь s = %2$.2f%n", r, s1);
        return s1;

    }

    static double calcSideSquare(double r) {
        double side = 2 * r;
        System.out.printf("Сторона квдрата = %1$.2f\n", side);
        return side;
    }

    static double calcAreaSquare(double side) {
        double s2 = side * side;
        System.out.printf("Площадь квдрата = %1$.2f%n", s2);
        return s2;
    }

    static double areaPaintedPart(double s1, double s2) {
        double diffAreas = s2-s1;
        System.out.printf("Плоащдь закрашенной части = %1$.2f", diffAreas);
        return diffAreas;
    }

    static void logic(double cat1,double cat2){
        double c = calcHypot(cat1, cat2);
        double r = calcRadius(c);
        double s1 = calcAreaCircle(r);
        double side = calcSideSquare(r);
        double s2 = calcAreaSquare(side);
        double diffAreas = areaPaintedPart(s1, s2);
    }
}