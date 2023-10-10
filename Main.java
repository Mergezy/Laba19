import java.util.Scanner;

public class Main {
    private int x;
    private int y;

    public Main(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calculateExpression() {
        if (y != 0) {
            return 2 * x + 3.0 / y; // Обратите внимание, что 3 делится на double, чтобы избежать целочисленного деления
        } else {
            System.out.println("Ошибка: деление на ноль");
            return Double.NaN; // Возврат NaN (Not-a-Number) в случае деления на ноль
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x (целое число): ");
        int x = scanner.nextInt();

        System.out.print("Введите значение y (целое число): ");
        int y = scanner.nextInt();

        // Создаем объект класса с введенными значениями x и y
        Main calculator = new Main(x, y);

        // Вычисляем и выводим значение выражения
        double result = calculator.calculateExpression();
        System.out.println("Значение выражения: " + result);
    }
}
