

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Вы ввели  " + Float.toString(inpurDigit()));
    }

    public static float inpurDigit() {
        float data = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите цифру ");
            data = scanner.nextFloat();
            scanner.close();
            return data;
        } catch (InputMismatchException e) {
            System.out.println("Это не цифра! Давайте повторим .");
            return inpurDigit();
        }
    }
}
