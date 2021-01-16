public class ExampleException {

  public static int rectangleArea(int a, int b) throws IllegalArgumentException {
    int result;
    if (a >= 0 && b >= 0) {
        result = a * b;
    } else {
        throw new IllegalArgumentException("input value is below zero!");
    }
    return result;
  }
}