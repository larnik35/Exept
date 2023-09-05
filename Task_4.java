

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        try {
            System.out.printf("\"%s\"", InputData());
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String InputData() throws EmptyStringException {
        String data;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст ");
        data = scanner.nextLine();
        scanner.close();
        if (data.isEmpty())
            throw new EmptyStringException("Нельзя вводить пустую строку");
        return data;
    }
}

class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}