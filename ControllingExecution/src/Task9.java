public class Task9 {

    public static void fib(int i) {
        if (i < 0) {
            System.out.println("Um, please enter non negative value ");
        } else if (i == 0) {
            System.out.println("Um, please enter value not equal 0");
        } else if (i == 1) {
            System.out.println("1");
        } else {
            int first = 1;
            int second = 1;
            int third;
            System.out.print(first + " " + second + " ");
            for (int j = 2; j < i; j++) {
                third = first + second;
                second = first;
                first = third;
                System.out.print(third + " ");

            }
        }
    }
}
