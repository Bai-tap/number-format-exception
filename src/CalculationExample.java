import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();

        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int add = x + y;
            int sub = x - y;
            int mul = x * y;
            int div = x / y;
            System.out.printf("x + y = %d\n", add);
            System.out.printf("x - y = %d\n", sub);
            System.out.printf("x * y = %d\n", mul);
            System.out.printf("x / y = %d\n", div);
        } catch (Exception e) {
            System.err.println("Exception : " + e.getMessage());
        }
    }
}
