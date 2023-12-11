

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static boolean continueExecution = true;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (continueExecution) {
            //Task roster
            int numberOfTask = taskRoaster();
            switch (numberOfTask) {
                case 1: {
                    //Task1
                    task1();
                    break;
                }
                case 2: {
                    //Task2
                    task2();
                    break;
                }
                case 3: {
                    //Task3
                    task3();
                    break;
                }
                case 4: {
                    //Task4
                    task4();
                    break;
                }
                case 5: {
                    //Task5
                    task5();
                    break;
                }
                case 6: {
                    //Task6
                    task6();
                    break;
                }
                case 7: {
                    //Task7
                    task7();
                    break;
                }
                case 8: {
                    //Task8
                    task8();
                    break;
                }
                case 9: {
                    //Task9
                    task9();
                    break;
                }

                case 10: {
                    //Task10
                    task10();
                    break;
                }
                case 11: {
                    //Task12
                    task11();
                    break;
                }
                case 12: {
                    //Task10
                    task12();
                    break;
                }
                default:
                    System.out.println("Выберите задание!");
                    break;
            }
            nextTaskQuestion();
        }


    }

    public static int taskRoaster() {
        System.out.print("Выберите задание для проверки: ");
        return scanner.nextInt();
    }

    public static void nextTaskQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Хотите проверить другую задачу?  Да/Нет: ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("да")) {
            continueExecution = true;
        } else if (choice.equalsIgnoreCase("нет")) {
            scanner.close();
            continueExecution = false;
        }
    }

    public static void task1() {
        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.print(n1 + " " + n2);

        n3 = n1 + n2;
        while (n3 <= 10000000) {
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }

    public static void task2() {
        int max = 1000000;
        boolean[] isPrime = new boolean[max + 1];

        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= max; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task3() { for (int number = 10; number <= 1000000; number++) {
        int digits = String.valueOf(number).length();
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number);
        }
    }
    }



    public static void task4() { // в другом файле

    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        if (str.equals((new StringBuffer(str)).reverse().toString()))
            System.out.println("pal");
        else
            System.out.println("not");
    }

    public static void task6() { // в другом файле

    }

    public static void task7() {
        int number = 42; // Пример значения переменной типа int
        for (int i = 31; i >= 0; i--) { // Начинаем с самого старшего бита и заканчиваем самым младшим 0
            int bite = 1 << i;
            int result = (number & bite) >> i;
            System.out.println(result); // Выводим результат
        }
    }

    public static void task8() {
        int count = 0;

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                String formattedHour = String.format("%02d", hour);
                String formattedMinute = String.format("%02d", minute);
                if (formattedHour.charAt(0) == formattedMinute.charAt(1) &&
                        formattedHour.charAt(1) == formattedMinute.charAt(0)) {
                    System.out.println(formattedHour + ":" + formattedMinute); // Выводим симметричную комбинацию
                    count++;
                }
            }
        }
        System.out.println("Общее число симметричных комбинаций: " + count); // Выводим общее число симметричных комбинаций
    }

    public static void task9() {
        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("Сумма всех чисел, кратных 3 или 5, от 0 до 1000 равна " + sum);
    }
    public static void task10() {
        int number = 2520; // начинаем с 2520, так как это наименьшее число, которое делится на числа от 1 до 10
        boolean found = false;

        while (!found) {
            boolean isDivisible = true;
            for (int i = 11; i <= 20; i++) {
                if (number % i != 0) {
                    isDivisible = false;
                    break;
                }
            }
            if (isDivisible) {
                found = true;
            } else {
                number += 2520; // так как наше число должно быть кратно 2520, можно увеличивать на 2520, чтобы ускорить проверку
            }
        }

        System.out.println("Наименьшее положительное число, которое делится на все числа от 1 до 20: " + number);
    }
    public static void task11() {
        for (int i = 1; i <= 1000; i++) {
            if (i % 15 == 0) {
                System.out.println("hiss");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void task12() {
    Scanner scanner = new Scanner(System.in);
System.out.println("Введите начальный пробег спортсмена в километрах (x): ");
    double initialDistance = scanner.nextDouble();

System.out.println("Введите желаемый общий пробег спортсмена в километрах (y): ");
    double targetDistance = scanner.nextDouble();

    double currentDistance = initialDistance;
    int day = 1;

while (currentDistance < targetDistance) {
        currentDistance += currentDistance * 0.1;
        day++;
    }

System.out.println("На " + day + "-й день пробег спортсмена составит не менее " + targetDistance + " км.");
}
}









