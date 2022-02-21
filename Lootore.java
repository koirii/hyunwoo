package org.zerock;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lootore {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("복권을 뽑을실 금액을 입력해주세요 장당 1000원입니다");

        int user = (Integer.parseInt(scanner.nextLine())/1000);
        int[][] lotoonum = new int[user][];
        for (int x = 0; x <user; x++) {

            int[] value = new int[6];

            outer:
            for (int i = 0; i < 6; i++) {
                int a = random.nextInt(45) + 1;
                value[i] = a;
                int count = i-1;
                for (int j = 0; j < count ; j++) {
                    if (value[j]== a){
                        System.out.println("중복");
                        i--;
                        continue outer;

                    }
                }
            }

            System.out.println(Arrays.toString(value));
            lotoonum[x]= value;
        }
        System.out.println(Arrays.deepToString(lotoonum));
    }
}
