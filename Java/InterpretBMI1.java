import java.util.Scanner;

public class InterpretBMI1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a BMI value: ");
    double bmi = input.nextDouble();

    if (bmi < 18.5)
      System.out.println("BMI " + bmi + ": Underweight");
    if (bmi < 25)
      System.out.println("BMI " + bmi + ": Normal");
    if (bmi < 30)
      System.out.println("BMI " + bmi + ": Overweight");
    if (bmi >= 30)
      System.out.println("BMI " + bmi + ": Obese");
  }
}
