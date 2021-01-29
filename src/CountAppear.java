import java.util.HashSet;

// http://codingdojang.com/scode/393?answer_mode=hide
public class CountAppear {
    static int n = 8;
    static int len = 10000;
    public static void main(String[] args) {
        int[] arr = new int[String.valueOf(len).length()];
        int i = 0;
        int m = 1;
        int count = 0;
        int temp = 0;
        do {
            System.out.println(arr.toString());
            if(i==0) {
                temp = n;
            } else {
                temp = temp + n * m;
            }
            m = m * 10;
            i++;
        } while (temp < len);
    }

    private static void countAppear() {

    }

    private static void findNum() {

    }
}
