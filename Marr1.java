package org.zerock;

import java.util.Arrays;

public class Marr1
{
    public static void main(String[] args) {
        int[][] arr = { {1,1},{5,5},{10,6},{1,10}};

        int[] target ={9,9};
        int[] result={0,0};
        int[] result1={0,0};
        double min=1000000000000000000000000000000000000000.0;
        double max=0;

        for (int[] value:arr) { //여기 for문으로 arr[0][0] arr[0][1]>>>>arr[1][0] arr[1][1]반복이됨
            System.out.print("가려는 곳");
            System.out.print(Arrays.toString(value)); //arr의 배열의 데이터를 출력함
            System.out.println("와의 거리는");


            double distance=
                    Math.sqrt(Math.pow(value[0]-target[0],2)
                            +
                            Math.pow(value[1]-target[1],2) );//대각선길이 구하는방법
            System.out.println(distance+"입니다");

            if(min > distance){
                min=distance;
                result=value;
            }
            if(max<distance){
                max=distance;
                result1=value;
            }

        }
        System.out.println("현재 최저거리는"+min+"입니다");
        System.out.print(Arrays.toString(result));
        System.out.println("이 현재위치와 최저거리입니다");

        System.out.println("현재 최대거리는"+max+"입니다");
        System.out.print(Arrays.toString(result1));
        System.out.println("이 현재위치와 최대거리입니다");

    }
}
