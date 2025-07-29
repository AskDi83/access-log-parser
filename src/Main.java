import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();
        int sumNum = firstNumber + secondNumber;
        System.out.println("Сумма чисел = " + sumNum);
        int razNum = firstNumber - secondNumber;
        System.out.println("Разность чисел = " + razNum);
        int mulNum = firstNumber * secondNumber;
        System.out.println("Произведение чисел = " + mulNum);
        double divNum = (double) firstNumber / secondNumber;
        System.out.println("Частное чисел = " + divNum);
    }
}