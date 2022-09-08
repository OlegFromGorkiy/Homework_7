public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        task_01();
        task_02();
        task_03();
        task_04();
        task_05();
        task_06();
        task_07();
        task_08();
        task_09();
        task_11();
        task_12();
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Эатрачено " + elapsedTime + " наносекунд");
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
        System.out.printf("Месяц %d, накопления Василия составляют %d.\n", count, bankAccount);
        System.out.println("***\n");
    }

    public static void task_06() {
        System.out.println("Задание 6");
        int bankAccount = 15_000;
        int percent = 7;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 12; j++) {
                bankAccount = bankAccount + bankAccount * percent / 100;
                if (j % 6 == 0) System.out.printf("Год %d, месяц %d, накопления Василия составляют %d.\n",
                        i, j, bankAccount);
            }
        }
        System.out.println("***\n");
    }

    public static void task_07() {
        System.out.println("Задание 7");
        int firstFriday = (int) Math.round(1 + Math.random() * 6);
        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", i);
        }
        System.out.println("***\n");
    }

    public static void task_08() {
        System.out.println("Задание 8");
        int period = 79;
        int thisYear = 2022;
        int nextAppearance = 0;
        for (int i = thisYear - 200; i < thisYear; i++) {
            if (i % period == 0) {
                for (int j = i; j <= thisYear; j += period) {
                    System.out.println(j);
                    nextAppearance = j + period;
                }
                break;
            }
        }
        System.out.println(nextAppearance);
        System.out.println("***\n");
    }

    public static void task_09() {
        System.out.println("Задание 9");
        for (int i = 1; i < 11; i++) {
            System.out.printf("2x%d=%d\n", i, i * 2);
        }
        System.out.println("***\n");
    }

    public static void task_11() {
        System.out.println("\"Сложное\" задание 1");
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < 31; i++) {
            builder.append(i).append(':');
            if (i % 3 == 0) builder.append(" ping");
            if (i % 5 == 0) builder.append(" pong");
            System.out.println(builder);
            builder = new StringBuilder();//.delete(0,builder.length());
        }
        System.out.println("***\n");
    }

    public static void task_12() {
        System.out.println("\"Сложное\" задание 2");
        int first = 0;
        int second = 1;
        StringBuilder builder = new StringBuilder();
        builder.append(first).append(" ").append(second);
        for (int i = 2; i < 10; i++) {
            int next = first + second;
            builder.append(" ").append(next);
            first = second;
            second = next;
        }
        System.out.println(builder);
        System.out.println("***\n");
    }
}
