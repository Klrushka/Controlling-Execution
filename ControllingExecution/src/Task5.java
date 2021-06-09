public class Task5 {
    /*
   Suppose we have the number 9 (1001) in order to get a binary string, we shift 1 by 31 to the left, thus we get all 0s to it (1000 ...)
   then we shift to the right and get (... 0001)
   from where it comes out, then we shift 0 by 30 to the left (0100 ...), and then to the right by 31 (0000 ...)
   from where 0 comes out, we repeat so 31 times to check each digit.
    */
    static String intToBinaryString (int i){
        StringBuilder sb = new StringBuilder();
        for (int j = 31; j >= 0; j--) {
            char c = ((i << j >>> 31) == 1) ? '1' : '0';
            sb.append(c);
        }

        return sb.reverse().toString();
    }
}
