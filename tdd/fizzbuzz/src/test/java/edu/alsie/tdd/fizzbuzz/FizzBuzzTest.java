package edu.alsie.tdd.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

  @Test
  public void testIfAnumberIsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertTrue(fizzBuzz.isFizz(3));
  }


  @Test
  public void testIfFifteenNumberIsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertTrue(fizzBuzz.isFizz(15));
  }

  @Test
  public void testIfFiveNumberIsBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertTrue(fizzBuzz.isBuzz(5));
  }

  @Test
  public void testGivenOneThenIsNotBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertFalse(fizzBuzz.isBuzz(1));
  }

  @Test
  public void testIsNumberFizzBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertTrue(fizzBuzz.isFizzBuzz(15));
  }

  @Test
  public void testGiven3ThenIsNotFizzBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertFalse(fizzBuzz.isFizzBuzz(3));
  }

  @Test
  public void testGiven5ThenIsNotFizzBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertFalse(fizzBuzz.isFizzBuzz(5));
  }

  @Test
  public void testGiven3ThenPrintFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String expected = "Fizz";
    String actual = fizzBuzz.print(3);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testGiven1ThenPrintNumber() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String expected = "1";
    String actual = fizzBuzz.print(1);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testGiven15ThenPrintIsFizzBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String expected = "FizzBuzz";
    String actual = fizzBuzz.print(15);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testGiven20ThenPrintIsBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String expected = "Buzz";
    String actual = fizzBuzz.print(20);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testGiven0ThenNotPrintIsBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String expected = "0";
    String actual = fizzBuzz.print(0);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testGiven13ThenIsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertTrue(fizzBuzz.isFizz(13));
  }

  @Test
  public void testGiven31ThenIsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertTrue(fizzBuzz.isFizz(31));
  }

  @Test
  public void testGiven51ThenIsBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertTrue(fizzBuzz.isBuzz(51));
  }

  @Test
  public void testGiven53ThenIsNotFizzBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assert.assertFalse(fizzBuzz.isFizzBuzz(53));
  }

}
