package org.zerock;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lootto1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.println("복권을 살횟수를 눌러주세요 횟수당 1000원입니다");
        int user = scanner.nextInt();
        int[][] lotterynum = new int[user][6];
        int cost = 1000*user;

        for (int x = 0; x < user; x++) {

            int[] values = new int[6]; //로또번호를 저장하기위한 배열

            mid:
            for (int i = 0; i < 6; i++) {

                int value = random.nextInt(45) + 1;

                int count = i - 1;
                //카운트값이 음수라면 검사x(첫번째)
                if (count < 0) {
                    values[i] = value;

                    continue;
                }
                //중복검사
                for (int j = 0; j <= count; j++) {
                    if (values[j] == value) {

                        --i;
                        continue mid;
                    }
                    values[i] = value;


                } //end for j



            }//end for i
            lotterynum[x] =values;
            System.out.println(Arrays.toString(values));
        }//end for x
        System.out.println("당신의 복권번호는");
        System.out.println(Arrays.deepToString(lotterynum));
        System.out.println("입니다");
        System.out.println();
        System.out.println(user+"장 사셨고 가격은"+cost+"원입니다"); }//end main
}