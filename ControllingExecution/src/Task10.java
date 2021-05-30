import java.util.ArrayList;

public class Task10 {
    public static void vampireNumbers(){
        ArrayList<Character> numbers = new ArrayList<>();
        int counter = 0;

        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                if (i  * j > 1000) {
                    StringBuffer value = new StringBuffer(Integer.toString(i*j));
                    numbers.add(Integer.toString(i).charAt(0));
                    numbers.add(Integer.toString(i).charAt(1));
                    numbers.add(Integer.toString(j).charAt(0));
                    numbers.add(Integer.toString(j).charAt(1));

                    for (int k = 0; k < 4; k++) {
                        if (value.indexOf(numbers.get(k).toString()) != -1){
                            value.deleteCharAt(value.indexOf(numbers.get(k).toString()));
                        } else break;
                    }

                    if (value.length() == 0) System.out.println(i * j + " = " + i + " * " + j);
                    value.setLength(0);
                    numbers.clear();

                }
            }
        }
    }
}
