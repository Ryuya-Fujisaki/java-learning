import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scannerの初期化
        Scanner scanner = new Scanner(System.in);

        //ユーザーからの入力を受け取る
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        //計算と結果表示
        int sum = num1 + num2;
        int difference = num1 -num2;
        int product = num1 * num2;
        double quotient = (num2 != 0) ? (double) num1 / num2 : Double.NaN;

        //結果を表示
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if (!Double.isNaN(quotient)) {
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Quotient: Undefined (division by zero)");
        }
        scanner.close();
    }
}