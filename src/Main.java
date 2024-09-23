public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №6\n");

        //Task 1
        System.out.println("Задание №1:");
        for (int i = 1; i <= 10; i++)
            System.out.println(i);


        //Task 2
        System.out.println("\nЗадание №2:");
        for (int i = 10; i >= 1; i--)
            System.out.println(i);


        //Task 3
        System.out.println("\nЗадание №3:");
        for (int i = 2; i <= 17; i = i + 2)
            System.out.println(i);


        //Task 4
        System.out.println("\nЗадание №4:");
        for (int i = 10; i >= -10; i--)
            System.out.println(i);


        //Task 5
        System.out.println("\nЗадание №5:");
        for (int i = 1904; i <= 2096; i = i + 4)
            System.out.println(+ i + " год является високосным");


        //Task 6
        System.out.println("\nЗадание №6:");
        for (int i = 7; i <= 98; i = i + 7)
            System.out.println(i);


        //Task 7
        System.out.println("\nЗадание №7:");
        for (int i = 1; i <= 512; i = i * 2)
            System.out.println(i);


        //Task 8
        System.out.println("\nЗадание №8:");
        int plusMoney = 29000;
        int totalMoney = 0;
        for (int i = 1; i <= 12; i++) {
            totalMoney = totalMoney + plusMoney;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMoney + " рублей");
        }


        //Task 9
        System.out.println("\nЗадание №9:");
        int plusMoneyBank = 29000;
        int totalMoneyBank = 0;
        for (int i = 1; i <= 12; i++) {
            totalMoneyBank = totalMoneyBank + plusMoneyBank;
            totalMoneyBank = totalMoneyBank + totalMoneyBank/100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMoneyBank + " рублей");
        }


        //Task 10
        System.out.println("\nЗадание №10:");
        int number = 0;
        for (int i = 2; i <= 20; i = (number * 2) + 2) {
            number = number + 1;
            System.out.println("2*" + number + "=" + i);
        }

    }
}