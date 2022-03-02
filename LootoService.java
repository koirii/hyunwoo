package org.zerock;

import java.util.Arrays;
import java.util.Random;

public class LootoService
{

    public int[][] raffle(int cost){

        Random random = new Random();
        int[][] lotoonum = new int[cost][];
        for (int x = 0; x <cost; x++) {

            int[] value = new int[6];

            outer:
            for (int i = 0; i < 6; i++) {
                int a = random.nextInt(45) + 1;
                value[i] = a;
                int count = i-1;
                for (int j = 0; j < count ; j++) {
                    if (value[j]== a){

                        i--;
                        continue outer;

                    }
                }
            }

            System.out.println(Arrays.toString(value));
            lotoonum[x]= value;
        }
        return lotoonum;
}
}
