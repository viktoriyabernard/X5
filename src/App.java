import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
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
        System.out.print("Введите целое трехзначное число: ");
        Scanner myScanner = new Scanner(System.in);
        String myString = myScanner.nextLine();
        int myNum1 = Integer.parseInt(myString.substring(0,1));
        int myNum2 = Integer.parseInt(myString.substring(1,2));
        int myNum3 = Integer.parseInt(myString.substring(2));
        int[] myArray = new int[]{myNum1, myNum2, myNum3};
        int summ = myArray[0] + myArray[1] + myArray[2];
        System.out.println("Сумма цифр введенного трехзначного числа: " + myArray[0] + " + " + myArray[1] + " + " + myArray[2] + " = " + summ);
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
        }else if(myInt < 0){
            myInt = myInt - 2;
            System.out.println("Итоговое число (N < 0, то N-2): " + myInt);
        }else{
            myInt = 10;
            System.out.println("Итоговое число (N = 0, то N=10): " + myInt);
        }
    }

    public static void methodFive() {
        //Ввести три целых числа с консоли. Вывести на экран наименьшее из них
        System.out.println("ДЗ Урок №2. Задача №5");
        System.out.print("Введите три целых числа через пробел: ");
        Scanner myScanner = new Scanner(System.in);
        String myString = myScanner.nextLine();
        String[] myArray = myString.split(" ");
        int myInt1 = Integer.parseInt(myArray[0]);
        int myInt2 = Integer.parseInt(myArray[1]);
        int myInt3 = Integer.parseInt(myArray[2]);
        if (myInt1 < myInt2) {
            if (myInt1 < myInt3) {
                System.out.println("Наименьшее число (1): " + myInt1);
            }else {
                System.out.println("Наименьшее число (3): " + myInt3);
            }
        }else if(myInt2 < myInt3){
            System.out.println("Наименьшее число (2): " + myInt2);
        }else {
            System.out.println("Наименьшее число (3): " + myInt3);
        }
    }

    public static void methodSix() {
        //Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число»,
        // «нулевое число», «положительное нечетное число» и т.д.
        System.out.println("ДЗ Урок №2. Задача №6");
        System.out.print("Введите целое число: ");
        Scanner myScanner = new Scanner(System.in);
        int myInt = myScanner.nextInt();
        if (myInt > 0){
            if (myInt % 2 == 0){
                System.out.println("Положительное четное число: " + myInt);
            }else{
                System.out.println("Положительное нечетное число: " + myInt);
            }
        }else if (myInt == 0){
            System.out.println("Нулевое число: " + myInt);
        }else {
            if (myInt % 2 == 0) {
                System.out.println("Отрицательное четное число: " + myInt);
            }else{
                System.out.println("Отрицательное нечетное число: " + myInt);
            }
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
        switch (myInt) {
            case 905 -> System.out.println("Москва. Стоимость разговора: 41,5 руб.");
            case 194 -> System.out.println("Ростов. Стоимость разговора: 19,8 руб.");
            case 491 -> System.out.println("Краснодар. Стоимость разговора: 26,9 руб.");
            case 800 -> System.out.println("Киров. Стоимость разговора: 50,0 руб.");
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
        Integer[] myArray = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        int summPlus = 0;
        int countPlus = 0;
        int countMinus = 0;
        int summChMinus = 0;
        int summMinus = 0;
        for (int a:myArray){
            if (a > 0){
                summPlus = summPlus + a;
                countPlus++;
            }else if (a < 0) {
                if (a % 2 == 0) {
                    summChMinus = summChMinus + a;
                }
                countMinus++;
                summMinus = summMinus + a;
            }
        }
        float arifmMinus = (float) summMinus/countMinus;
        System.out.println("Максимальное значение: "+ Collections.max(Arrays.asList(myArray)));
        System.out.println("Сумма положительных элементов: "+ summPlus);
        System.out.println("Сумма четных отрицательных элементов: "+ summChMinus);
        System.out.println("Количество положительных элементов: "+ countPlus);
        System.out.println("Среднее арифметическое отрицательных элементов: "+ arifmMinus);
    }

    public static void methodNine() {
        //Дан массив целых чисел: [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].
        //Переставить элементы массива в обратном порядке. Вывести результат в консоль
        System.out.println("ДЗ Урок №2. Задача №9");
        System.out.println("Дан массив целых чисел: [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52]");
        Integer[] myArray = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.println("Массив, отсортированный в обратном порядке: "+ Arrays.toString(myArray));
    }

    public static void methodTen() {
        //Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52].
        // Переместить нули в конец массива. Вывести результат в консоль
        System.out.println("ДЗ Урок №2. Задача №10");
        System.out.println("Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]");
        int[] myArray = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int[] myArrayNew = new int[myArray.length];
        int myCount = 0;
        for (int a:myArray){
            if (a != 0){
                myArrayNew[myCount] = a;
                myCount++;
            }
        }
        System.out.println("Массив, в котором нули перенесены в конец: "+ Arrays.toString(myArrayNew));
    }
}
