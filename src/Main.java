// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int x = 100; //начальная сумма
        int y = 1200; // сумма пополнения
        int i; // итоговая сумма
        int bonus;
        bonus = y / 100 * 1;


        if (y > 1000) {
            i = x + y + bonus;
        } else {
            i = y + x;
        }
        System.out.println("Итоговая сумма " + i);
        System.out.println ("Бонусы " + bonus);
    }
}