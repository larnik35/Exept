

public class Task_3 {
    public static void main(String[] args) {
        try {
            int a = 9;
            int b = 3;
            System.out.println(a / b);
            printSum(a, b);
            int[] abc = { 1, 2 };
            abc[0] = 9 ;
            printArrey(abc);
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
    public static void printArrey ( int[] abs ){
            int i = 0;
        for (int index = 0; index < abs.length; index++) {
            i = abs[index];
            System.out.print(i + ", ");

        }
    }

}
