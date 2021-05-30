public class Main {
    public static void main(String[] args) {

        /* Task4
        tested in between [2..1000000]
        now between [2..100]
        Напишите программу, использующую два вложенных цикла for и оператор
        остатка (%) для поиска и вывода простых чисел (то есть целых чисел, не делящихся
        нацело ни на какое другое число, кроме себя и 1).
         */
        Task4.simpleNumbers();

        // Task 5
        /*
        Повторите упражнение 1 из предыдущей главы, используя тернарный оператор
        и поразрядную проверку для вывода нулей и единиц (вместо вызова метода Integer.
        toBinaryString()).
        */
        System.out.println("\nTask 5: 9 = " + Task5.intToBinaryString(9));

        // Task 9
        /*
        Числами Фибоначчи называется числовая последовательность 1,1,2,3,5,8,13,
        21, 34 и т. д., в которой каждое число, начиная с третьего, является суммой двух
        предыдущих. Напишите метод, который получает целочисленный аргумент и выво-
        дит указанное количество чисел Фибоначчи. Например, при запуске командой java
        Fibonacci 5 (где Fibonacci — имя класса) должна выводиться последовательность
        1, 1, 2, 3, 5.
        */
        System.out.print("Task 9: ");
        Task9.fib(5);
        System.out.println('\n');

        // Task 10
        /*
        Вампирами называются числа, состоящие из четного количества цифр и полученные
        перемножением пары чисел, каждое из которых содержит половину цифр резуль­
        тата. Цифры берутся из исходного числа в произвольном порядке, завершающие
        нули недопустимы. Примеры:
        1) 1261 =21 *60;
        2) 1827 = 21 *87;
        3) 2187 = 27*81.
        */
        System.out.println("Task 10 Vampire numbers: ");
        Task10.vampireNumbers();
    }
}
