package samir.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void FizzTest() {
    assertEquals("Fizz", FizzBuzz.getOutput(3));
    assertEquals("Fizz", FizzBuzz.getOutput(6));
  }

  @Test
  void BuzzTest() {
    assertEquals("Buzz", FizzBuzz.getOutput(5));
    assertEquals("Buzz", FizzBuzz.getOutput(10));
  }
}