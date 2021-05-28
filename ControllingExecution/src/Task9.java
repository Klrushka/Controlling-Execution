public class Task9 {

    public static void fib (int i) {
        int first = 1;
        int second = 1;
        int third;
        System.out.print (first + " " + second + " ");
        for (int j = 2; j < i; j++){
            third = first + second;
            second = first;
            first = third;
            System.out.print(third + " ");

        }

    }
}
