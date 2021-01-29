
// http://codingdojang.com/scode/365?answer_mode=hide
public class Generator {
    static boolean[] generated = new boolean[5001];
    public static void main(String[] args) {

        int sum;
        int i = 1;

        do {
            sum = setGerated(i);
            generated[sum] = true;
            i++;
        } while (sum < 5000);


        int selfSum = 0;
        for (int j = 0; j < generated.length; j++) {
            if(generated[j]==false) {
                selfSum += j;
            }
        }

        System.out.println(selfSum);
    }

    private static int setGerated(int generator) {
        int sum = generator;
        while (generator > 0) {
            sum += generator % 10;
            generator = generator / 10;
        }
        return sum;
    }
}
