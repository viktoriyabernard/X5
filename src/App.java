import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Введите номер задачи (от 1 до 10): ");
        Scanner myScanner = new Scanner(System.in);
        int myInt = myScanner.nextInt();
        switch (myInt) {
            case 1 -> methodOne();
            case 2 -> methodTwo();
            case 3 -> methodThree();
            case 4 -> methodFour();
            case 5 -> methodFive();
            case 6 -> methodSix();
            case 7 -> methodSeven();
            case 8 -> methodEight();
            case 9 -> methodNine();
            case 10 -> methodTen();
            default -> System.out.println("Такой задачи не существует.");
        }
    }

    public static void methodOne() {
        //Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа
        System.out.println("ДЗ Урок №2. Задача №1");
        System.out.print("Введите целое число: ");
        Scanner myScanner = new Scanner(System.in);
        String myString = myScanner.nextLine();
        System.out.println("Последняя цифра введенного числа = " + myString.substring(myString.length() - 1));
    }

    public static void methodTwo() {
        //Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа
        System.out.println("ДЗ Урок №2. Задача №2");
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите целое трехзначное число: ");
        String myString = myScanner.nextLine();
        int sum = 0;
        char[] ch = myString.toCharArray();
        for (int i = 0; i < myString.length(); i++) {
            sum += Integer.parseInt(String.valueOf(ch[i]));
        }
        System.out.println("Сумма цифр введенного трехзначного числа: " + sum);
    }

    public static void methodThree() {
        //Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его. Вывести полученное число
        System.out.println("ДЗ Урок №2. Задача №3");
        System.out.print("Введите целое число: ");
        Scanner myScanner = new Scanner(System.in);
        int myInt = myScanner.nextInt();
        if (myInt > 0) {
            myInt++;
        }
        System.out.println("Итоговое число (если N > 0, то N++): " + myInt);
    }

    public static void methodFour() {
        //Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1;
        // если отрицательным, то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число
        System.out.println("ДЗ Урок №2. Задача №4");
        System.out.print("Введите целое число: ");
        Scanner myScanner = new Scanner(System.in);
        int myInt = myScanner.nextInt();
        if (myInt > 0) {
            myInt++;
            System.out.println("Итоговое число (N > 0, то N++): " + myInt);
        } else if (myInt < 0) {
            myInt = myInt - 2;
            System.out.println("Итоговое число (N < 0, то N-2): " + myInt);
        } else {
            myInt = 10;
            System.out.println("Итоговое число (N = 0, то N=10): " + myInt);
        }
    }

    public static void methodFive() {
        //Ввести три целых числа с консоли. Вывести на экран наименьшее из них
        System.out.println("ДЗ Урок №2. Задача №5");
        Scanner myScanner = new Scanner(System.in);
        int[] myIntArray = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите " + i + "-е целое число: ");
            myIntArray[i] = myScanner.nextInt();
        }
        int minNumber = myIntArray[0];
        for (int i = 1; i < myIntArray.length; i++) {
            if (myIntArray[i] < minNumber) {
                minNumber = myIntArray[i];
            }
        }
        System.out.println(minNumber + " - наименьшее число");
    }

    public static void methodSix() {
        //Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число»,
        // «нулевое число», «положительное нечетное число» и т.д.
        System.out.println("ДЗ Урок №2. Задача №6");
        System.out.print("Введите целое число: ");
        Scanner myScanner = new Scanner(System.in);
        int myInt = myScanner.nextInt();
        if (myInt > 0 && myInt % 2 == 0) {
            System.out.println(myInt + " - положительное четное число");
        } else if (myInt > 0 && myInt % 2 != 0) {
            System.out.println(myInt + " - положительное нечетное число");
        } else if (myInt < 0 && myInt % 2 == 0) {
            System.out.println(myInt + " - отрицательное четное число");
        } else if (myInt < 0 && myInt % 2 != 0) {
            System.out.println(myInt + " - отрицательное нечетное число");
        } else {
            System.out.println(myInt + " - нулевое число");
        }
    }

    public static void methodSeven() {
        //Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города.
        // (Москва(905) - 4.15 руб. Ростов(194) - 1.98 руб. Краснодар(491) - 2.69 руб. Киров(800) - 5.00 руб. ).
        // Пользователь в консоли должен ввести код города, а в ответ от программы получить, например,
        // при вводе кода 905, - «Москва. Стоимость разговора: 41.5 руб.»
        System.out.println("ДЗ Урок №2. Задача №7");
        System.out.print("Введите код города (Москва-905, Ростов-194, Краснодар-491, Киров-800): ");
        Scanner myScanner = new Scanner(System.in);
        int myInt = myScanner.nextInt();
        int t = 10; //Кол-во минут разговора
        switch (myInt) {
            case 905 -> System.out.println("Москва. Стоимость разговора: " + t * 4.15 + " руб.");
            case 194 -> System.out.println("Ростов. Стоимость разговора: " + t * 1.98 + " руб.");
            case 491 -> System.out.println("Краснодар. Стоимость разговора: " + t * 2.69 + " руб.");
            case 800 -> System.out.println("Киров. Стоимость разговора: " + t * 5.00 + " руб.");
            default -> System.out.println("Введенный код города (" + myInt + ") в справочнике не найден.");
        }
    }

    public static void methodEight() {
        //Дан массив целых чисел [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного массива найти и вывести на экран:
        // - максимальное значение
        // - сумму положительных элементов
        // - сумму четных отрицательных элементов
        // - количество положительных элементов
        // - среднее арифметическое отрицательных элементов
        System.out.println("ДЗ Урок №2. Задача №8");
        System.out.println("Дан массив целых чисел: [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]");
        Integer[] myArray = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int countPositiveNumbers = 0;
        int summPositiveNumbers = 0;
        int countNegativeNumbers = 0;
        int summNegativeNumbers = 0;
        int summEvenNegativeNumbers = 0;
        for (int a : myArray) {
            if (a > 0) {
                summPositiveNumbers = summPositiveNumbers + a;
                countPositiveNumbers++;
            } else if (a < 0) {
                if (a % 2 == 0) {
                    summEvenNegativeNumbers = summEvenNegativeNumbers + a;
                }
                countNegativeNumbers++;
                summNegativeNumbers = summNegativeNumbers + a;
            }
        }
        float averageNegativeNumbers = (float) summNegativeNumbers / countNegativeNumbers;
        System.out.println("Максимальное значение: " + Collections.max(Arrays.asList(myArray)));
        System.out.println("Сумма положительных элементов: " + summPositiveNumbers);
        System.out.println("Сумма четных отрицательных элементов: " + summEvenNegativeNumbers);
        System.out.println("Количество положительных элементов: " + countPositiveNumbers);
        System.out.println("Среднее арифметическое отрицательных элементов: " + averageNegativeNumbers);
    }

    public static void methodNine() {
        //Дан массив целых чисел: [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].
        //Переставить элементы массива в обратном порядке. Вывести результат в консоль
        System.out.println("ДЗ Урок №2. Задача №9");
        System.out.println("Дан массив целых чисел: [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52]");
        Integer[] myArray = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.println("Массив, отсортированный в обратном порядке: " + Arrays.toString(myArray));
    }

    public static void methodTen() {
        //Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52].
        // Переместить нули в конец массива. Вывести результат в консоль
        System.out.println("ДЗ Урок №2. Задача №10");
        System.out.println("Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]");
        int[] myArray = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] myArrayNew = new int[myArray.length];
        int myCount = 0;
        for (int a : myArray) {
            if (a != 0) {
                myArrayNew[myCount] = a;
                myCount++;
            }
        }
        System.out.println("Массив, в котором нули перенесены в конец: " + Arrays.toString(myArrayNew));
    }
}
