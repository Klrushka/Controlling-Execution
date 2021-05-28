public class Task4 {

    public static void simpleNumbers() {

        System.out.print("Task 4: Simple numbers: ");

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= 100; j++) {
                if ((i % j) == 0) {
                    if (i == j) System.out.print(i + " ");
                    else break;
                }
            }
        }
    }
}
