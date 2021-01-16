import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.ExpectedExceptionsHolder;

import static org.testng.Assert.*;

public class ExampleExceptionTest {

  /**
   * Test data for positive test.
   *
   * @return test data array
   */
  @DataProvider(name = "data")
  public static Object[][] data() {
    return new Object[][]{
        {2, 2, 4},
        {2, 3, 6},
        {88, 0, 0},
        {0, 0, 0}
    };
  }

  /**
   * Test data for exception test.
   *
   * @return test data array
   */
  @DataProvider(name = "negativeData")
  public static Object[][] negativeData() {
    return new Object[][]{
        {-2, 2},
        {2, -2},
        {-6, -1},
        {0, -4}
    };
  }

  @Test(dataProvider = "data")
  public void testRectangleArea(int a, int b, int c) {
    assertEquals(ExampleException.rectangleArea(a, b), c,
            "Calculated area is incorrect");
  }

  @Test(dataProvider = "negativeData", expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "input value is below zero!")
  public void testRectangleAreaNegative(int a, int b) {
    int c = ExampleException.rectangleArea(a, b);

  }
}