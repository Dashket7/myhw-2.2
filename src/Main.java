// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int amount = 100; //начальная сумма
        int replenishment = 400; // сумма пополнения
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int result = amount + replenishment + bonus; // итоговая сумма

        System.out.println("Итоговая сумма " + result);
        System.out.println("Бонусы " + bonus);
    }
}