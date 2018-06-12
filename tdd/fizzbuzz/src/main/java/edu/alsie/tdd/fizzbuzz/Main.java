package edu.alsie.tdd.fizzbuzz;

public class Main {

  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    for(int i = 0; i<=100; i++){
      System.out.println(fizzBuzz.print(i));
    }
  }
}
