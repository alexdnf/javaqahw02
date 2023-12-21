public class Main {
    public static void main(String[] args) {

        int amount = 18_659; // потраченная суммма
        int mile = 20; // сумма для начисления одной бонусной мили

        int bonus = amount/mile;
        System.out.println(bonus + " бонусных миль начисленно");
    }
}