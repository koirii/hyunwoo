package org.zerock;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] point = {{1,1},{2,1},{3,3},{9,2},{19,2}};
        System.out.println("현재 좌표를 x값>y값순으로 입력해주세요");
        int []target= new int[2];
        for (int i = 0; i < 2; i++) {
            target[i] = sc.nextInt();
        }
        System.out.print("현재좌표는");
        System.out.print(Arrays.toString(target));
        System.out.println("입니다");

        double min =100000000000000000000.0;
        double max =0;
        int[] result ={0,0};
        int[] result1 ={0,0};

        for (int [] val:point) {
            System.out.println(Arrays.toString(val));
            double distance=
                    Math.sqrt(Math.pow(val[0]-target[0],2)
                            +
                            Math.pow(val[1]-target[1],2) );//대각선길이 구하는방법
            System.out.println(distance+"입니다");

            if (min>distance){
                min =distance;
                result =val;
            }
            if(max<distance){
                max=distance;
                result1 =val;
            }

        }
        System.out.print("제일가까운곳과의 거리는"+min+"입니다 그곳은");
        System.out.print(Arrays.toString(result));
        System.out.println("입니다");

        System.out.print("제일 먼곳과의 거리는"+max+"입니다 그곳은");
        System.out.print(Arrays.toString(result1));
        System.out.println("입니다");
    }
}
