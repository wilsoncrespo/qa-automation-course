package edu.alsie.tdd.fizzbuzz;

public class Main {

  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    for(int i = 0; i<=Integer.MAX_VALUE; i++){
      System.out.println(fizzBuzz.print(i));
    }
  }
}
