package ru.stqa.JavaLearning;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("Alesia");
    double l = 5;
      System.out.println( "ploschad' kvadrata so storonoi " + l + "=" + area(l));
    double a = 4;
    double b = 3;
      System.out.println("ploschad' praymougolnika so stotonami " + a + " i " + b + " = " + area(a,b));

  }
  public static void hello(String somebody) {

      System.out.println("Hello, " + somebody + "!");
  }
  public static double area (double len){
      return len * len;
  }
  public static double area (double a, double b){
      return a * b;
  }

}	