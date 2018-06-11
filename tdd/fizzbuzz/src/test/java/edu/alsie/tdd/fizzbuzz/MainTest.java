package edu.alsie.tdd.fizzbuzz;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class MainTest {

  @Test
  public void testMain() {
    assertThat(true, CoreMatchers.is(true));
  }
}
