package baekjoon.hash;


import java.util.*;

public class NumberCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[sc.nextInt()];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        int[] m = new int[sc.nextInt()];
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < m.length; i++) {
            map.put(m[i], 0);
        }
        for (int i = 0; i < n.length; i++) {
            if(map.containsKey(n[i])) {
                map.put(n[i], map.get(n[i])+1);
            }
        }
        for (int i = 0; i < m.length; i++) {
            sb.append(map.get(m[i])+ " ");
        }
        System.out.println(sb.toString());
    }

}
