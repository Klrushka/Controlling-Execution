import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task10 {
    public static void vampireNumbers(){
        List numbers = new List();
        ArrayList<String> answers = new ArrayList<>();

        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                if (i  * j > 1000) {
                    StringBuffer value = new StringBuffer(Integer.toString(i*j));
                    numbers.add(String.valueOf(Integer.toString(i).charAt(0)));
                    numbers.add(String.valueOf(Integer.toString(i).charAt(1)));
                    numbers.add(String.valueOf(Integer.toString(j).charAt(0)));
                    numbers.add(String.valueOf(Integer.toString(j).charAt(1)));

                    for (int k = 0; k < 4; k++) {
                        if (value.indexOf(numbers.getItem(k)) != -1){
                            value.deleteCharAt(value.indexOf(numbers.getItem(k)));
                        } else break;
                    }

                    if (value.length() == 0){
                        if (!(answers.contains(Integer.toString(i*j)))){
                            answers.add(Integer.toString(i*j));
                            System.out.println(i * j + " = " + i + " * " + j);
                        }

                    }
                    value.setLength(0);
                    numbers.clear();

                }
            }
        }
    }
}
