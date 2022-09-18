public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task7() {
        System.out.println("Задание 5. Циклы");
        int a = 0;
        int b = 1;
        int c = a + b;
        int d = b + c;
        int e = c + d;
        int f = d + e;
        int g = f + e;
        int h = f + g;
        int j = h + g;
        int k = j + h;
        for (int i = a; i <= k; i++) {
            if (i == a) {
                System.out.print(i + " ");
            }
            if (i == b) {
                System.out.print(i + " ");
            }
            if (i == c) {
                System.out.print(i + " ");
            }
            if (i == d) {
                System.out.print(i + " ");
            }
            if (i == e) {
                System.out.print(i + " ");
            }
                if (i == f) {
                    System.out.print(i + " ");
            }
            if (i == g) {
                System.out.print(i + " ");
            }
            if (i == h) {
                System.out.print(i + " ");
            }
            if (i == j) {
                System.out.print(i + " ");
            }
            if (i == k) {
                System.out.println(i + " ");
            }
        }
    }

    private static void task6() {
        System.out.println("Задание 4. Циклы");
        for (int i = 1; i <= 30; i++) {
            if (i%3 == 0) {
                System.out.println("ping");
            }
            if (i%5 == 0) {
                System.out.println("pong");
            }
            if (i%3 == 0 && i%5 == 0) {
                    System.out.println("ping pong");
            }
        }
        System.out.println();
    }
    private static void task5() {
        System.out.println("Задание 7. Условные операторы");
        int age = 25;
        int salary = 76000;
        int wantedSum = 500000;
        int maxMonthPay = salary / 2;
        int wantedSumWithPercent = wantedSum + wantedSum / 10; //базовая ставка 10% годовых
        int wantedSumWithPercentForYounger23 = wantedSumWithPercent + wantedSum / 100; // 11 % годовых для людей младше 23 лет
        int wantedSumWithPercentForYounger30 = wantedSumWithPercent + wantedSum / 200; // 10,5 % годовых о 23 лет до 30 лет
        int wantedSumWithPercentForSalary80000ButYounger23 = wantedSumWithPercentForYounger23 - wantedSum / 1000 * 7; // 10,3 % годовых для людей младше 23 лет и с зп 80 тыс
        int wantedSumWithPercentForSalary80000ButYounger30 = wantedSumWithPercentForYounger30 - wantedSum / 1000 * 7; // 9,8% годовых для людей младше 30 лет и с зп 80 тыс
        int monthPayWithPercent = wantedSumWithPercent / 12;  //ежемесячный платеж по кредиту
        int monthPayWithPercentForYounger23 = wantedSumWithPercentForYounger23 / 12;
        int monthPayWithPercentForYounger30 = wantedSumWithPercentForYounger30 / 12;
        int monthPayWithPercentForSalary80000ButYounger23 = wantedSumWithPercentForSalary80000ButYounger23 / 12;
        int monthPayWithPercentForSalary80000ButYounger30 = wantedSumWithPercentForSalary80000ButYounger30 / 12;

        if (age < 23 && salary < 80_000 && monthPayWithPercentForYounger23 > maxMonthPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " рублей равен " + maxMonthPay + " рублей. " +
                    "Платеж по кредиту " + monthPayWithPercentForYounger23 + " рублей. Отказано");

        } else if (age < 23 && salary < 80_000 && monthPayWithPercentForYounger23 < maxMonthPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " рублей равен " + maxMonthPay + " рублей. " +
                    "Платеж по кредиту " + monthPayWithPercentForYounger23 + " рублей. Одобрено");

        } else if (age >= 23 && age < 30 && salary < 80_000 && monthPayWithPercentForYounger30 > maxMonthPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " рублей равен " + maxMonthPay + " рублей. " +
                    "Платеж по кредиту " + monthPayWithPercentForYounger30 + " рублей. Отказано");

        } else if (age >= 23 && age < 30 && salary < 80_000 && monthPayWithPercentForYounger30 < maxMonthPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " рублей равен " + maxMonthPay + " рублей. " +
                    "Платеж по кредиту " + monthPayWithPercentForYounger30 + " рублей. Одобрено");

        } else if (age < 23 && salary >= 80_000 && monthPayWithPercentForSalary80000ButYounger23 < maxMonthPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " рублей равен " + maxMonthPay + " рублей. " +
                    "Платеж по кредиту " + monthPayWithPercentForSalary80000ButYounger23 + " рублей. Одобрено");

        } else if (age < 23 && salary >= 80_000 && monthPayWithPercentForSalary80000ButYounger23 > maxMonthPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " рублей равен " + maxMonthPay + " рублей. " +
                    "Платеж по кредиту " + monthPayWithPercentForSalary80000ButYounger23 + " рублей. Отказано");

        } else if (age >= 23 && age < 30 && salary >= 80_000 && monthPayWithPercentForSalary80000ButYounger30 < maxMonthPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " рублей равен " + maxMonthPay + " рублей. " +
                    "Платеж по кредиту " + monthPayWithPercentForSalary80000ButYounger30 + " рублей. Одобрено");

        } else if (age >= 23 && age < 30 && salary >= 80_000 && monthPayWithPercentForSalary80000ButYounger30 > maxMonthPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " рублей равен " + maxMonthPay + " рублей. " +
                    "Платеж по кредиту " + monthPayWithPercentForSalary80000ButYounger30 + " рублей. Отказано");
        }
        System.out.println();
    }
    private static void task4() {
        System.out.println("Задание 6. Условные операторы");
        int age = 25;
        int salary = 85_000;
        if (age >= 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) + " рублей");
        } else if (age >= 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 / 100 * 120) + " рублей");
        } else if (age >= 23 && salary >= 80_000){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 / 100 * 150) + " рублей");
        }
        else if (age < 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) + " рублей");
        }
     else if (age < 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 / 100 * 120) + " рублей");
        } else {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 / 100 * 150) + " рублей");
        }
        System.out.println();
        }


    private static void task3() {
        System.out.println("Задание 8. Переменные");
        int a = 111;
        int b = a %100 / 10;
            System.out.println("b = " + b);
        System.out.println();
        }

    private static void task2() {
        System.out.println("Задание 7. Переменные");
        int a = 5;
        int b = 7;
        System.out.println("a = " + (a + b - a) + " b = " + (a + b - b));
        System.out.println();
    }
    private static void task1() {
        System.out.println("Задание 6. Переменные");
         int a = 12;
         int b = 27;
         int c = 44;
         int d = 15;
         int e = 9;
         int result = a * (b + (c - d * e));
        System.out.println(Math.abs(result));
        System.out.println();
    }
}
