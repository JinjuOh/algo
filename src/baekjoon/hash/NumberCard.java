package baekjoon.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberCard {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int nLength = 0;
//        while (nLength==0) {
//            System.out.print("n의 크기를 입력 : ");
//            try {
//                nLength = sc.nextInt();
//                if(nLength<1||nLength>500000) {
//                    System.out.println("n의 길이는 1 이상 500,000 이하여야 합니다.");
//                    nLength = 0;
//                }
//            } catch (InputMismatchException ime) {
//                System.out.println("정수를 입력해주세요.");
//                sc = new Scanner(System.in);
//                nLength = 0;
//            }
//        }
//
//
//
//        int[] n = new int[nLength];
//        System.out.print("n의 요소를 입력("+n.length+"개) : ");
//        for (int i = 0; i < n.length; i++) {
//            n[i] = sc.nextInt();
//        }
//
//        System.out.println(Arrays.toString(n));
        int[] n = new int[] {6,3,2,10,10,10,-10,-10,7,3};
        int[] m = new int[] {10,9,-5,2,3,4,5,-10};

        NumberCard nc = new NumberCard();
        int[] ret = nc.solution(n, m);
        System.out.println(Arrays.toString(ret));
    }

    public int[] solution(int[] n, int[] m) {

        if(n.length<1 || n.length>500000) {
            return null;
        }

        if(m.length<1 || m.length>500000) {
            return null;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < m.length; i++) {
            map.put(m[i], 0);
        }

        System.out.println(map);

        for (int i = 0; i < n.length; i++) {
            if(map.containsKey(n[i])) {
                map.put(n[i], map.get(n[i])+1);
            }
        }

        return map.values().stream().mapToInt(e->(int) e).toArray();
    }

}
