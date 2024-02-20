package easy.problem_1;

import java.util.*;
import java.time.*;
import java.text.*;

/**
 * solution
 */
public class solution {
  // ! SOLVE HERE !!!!!!!!!!!!
  private static int sumOfCommonCharacters(String A, String B) {
    int count = 0;
    for (char c : B.toCharArray())
      if (A.contains(c + ""))
        ++count;
    return count;
  }

  private static int expectedResult(String A, String B) {
    int commonCount = 0;

    // Iterate through each character in B
    for (char ch : B.toCharArray()) {
      // Check if the character is present in A
      if (A.contains(String.valueOf(ch))) {
        commonCount++;
      }
    }

    return commonCount;
  }

  private static void runTestCase(int index, String A, String B) {

    // Calculate and print the total sum of common characters
    int totalSum = sumOfCommonCharacters(A, B);
    System.out.println("For A = \"" + A + "\" and B = \"" + B + "\", Total sum of common characters: " + totalSum);
    System.out.println("Expected Output: " + expectedResult(A, B) + "\n");

    boolean testResult = compareResults(A, B, totalSum);
    System.out.println("TEST CASE " + index + ": " + testResult);
  }
  // private static void runTestCase(String A, String B) {
  // // Calculate and print the total sum of common characters
  // int totalSum = sumOfCommonCharacters(A, B);
  // boolean testResult = compareResults(A, B, totalSum);

  // System.out.println("Test Case: " + A + " | " + B + " => " + testResult);
  // }

  private static boolean compareResults(String A, String B, int actualResult) {
    // Calculate the expected result
    int expected = 0;
    for (char ch : B.toCharArray()) {
      if (A.contains(String.valueOf(ch))) {
        expected++;
      }
    }

    // Compare actual and expected results
    return actualResult == expected;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Define test cases
    String[][] testCases = {
        { "aA", "aAAbbbb" },
        { "ZAza", "zzzzaaAAAz" },
        { "z", "ZZ" },
        { "", "" },
        { "abc", "123" },
        { "abc", "cba" }
        // Add more test cases as needed
    };

    // Run test cases using a loop
    for (int i = 0; i < testCases.length; i++) {
      runTestCase(i + 1, testCases[i][0], testCases[i][1]);
    }
  }
}