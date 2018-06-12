package edu.alsie.tdd.fizzbuzz;

public class FizzBuzz {
  public boolean isFizz(int number)
  {
    return (number % 3) == 0 ;
  }

  public boolean isBuzz(int number) {
    return (number % 5) == 0;
  }

  public boolean isFizzBuzz(int number){
    return this.isBuzz(number) && this.isFizz(number);
  }

  public String print(int number)
  {
    if (number == 0){
      return "0";
    }
    if (isFizzBuzz(number)) {
      return "FizzBuzz";
    }

    if (isFizz(number)){
      return "Fizz";
    }

    if (isBuzz(number)) {
      return "Buzz";
    }


    return Integer.toString(number);
  }
}
