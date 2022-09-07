public class Main {
    public static void main(String[] args) {
//        task_01();
//        task_02();
//        task_03();
//        task_04();
//        task_05();
        task_06();
    }

    public static void task_01() {
        System.out.println("Задание 1");
        int cash = 29000; //monthly add to total sum
        int totalSum = 0;
        int month = 0;
        while (totalSum <= 2_459_000) {
            month++;
            totalSum += totalSum / 100; // + 1%
            totalSum += cash;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей.%n", month, totalSum);
        }
        System.out.println("***\n");
    }

    public static void task_02() {
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("");
        for (; i > 0; --i) {
            System.out.print(i + " ");
        }
        System.out.println("\n***\n");
    }

    public static void task_03() {
        System.out.println("Задание 3");
        int population = 12_000_000;
        float fertility = 17f / 1000;
        float mortality = 8f / 1000;
        for (int i = 0; i <= 10; i++) { //null year for border conditions
            int peopleBorn = (int) (population * fertility);
            int peopleDied = (int) (population * mortality);
            if (i != 0) population += (peopleBorn - peopleDied); //null year for border conditions
            System.out.printf("Год %d, численность населения составляет %d.\n", i, population);
        }
        System.out.println("***\n");
    }

    public static void task_04() {
        System.out.println("Задание 4");
        int bankAccount = 15_000;
        int percent = 7;
        int count = 0;
        while (bankAccount <= 12_000_000) {
            count++;
            bankAccount = bankAccount + bankAccount * percent / 100;
            System.out.printf("Месяц %d, накопления Василия составляют %d.\n", count, bankAccount);
        }

        System.out.println("***\n");
    }

    public static void task_05() {
        System.out.println("Задание 5");
        int bankAccount = 15_000;
        int percent = 7;
        int count = 0;
        while (bankAccount <= 12_000_000) {
            if (count == 0) System.out.printf("Месяц %d, накопления Василия составляют %d.\n",
                    count, bankAccount); //null month for border conditions
            count++;
            bankAccount = bankAccount + bankAccount * percent / 100;
            if (count % 6 == 0) System.out.printf("Месяц %d, накопления Василия составляют %d.\n",
                    count, bankAccount);

        }
        System.out.printf("Месяц %d, накопления Василия составляют %d.\n",count, bankAccount);
        System.out.println("***\n");
    }
    public static void task_06() {
        System.out.println("Задание 6");
        int bankAccount = 15_000;
        int percent = 7;
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=12 ; j++) {
                bankAccount = bankAccount + bankAccount * percent / 100;
                if (j % 6 == 0) System.out.printf("Год %d, месяц %d, накопления Василия составляют %d.\n",
                        i,j, bankAccount);
            }
        }

        System.out.println("***\n");
    }
}
