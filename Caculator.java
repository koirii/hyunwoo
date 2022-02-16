package org.zerock;

import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫숫자를 입력하세요");
        double first = scanner.nextDouble();
        System.out.println("두번째숫자를 입력하세요");
        double second = scanner.nextDouble();
        double result;
        System.out.println("+는1 -는2 *는3 /는4 %는5를 입력하세요");
        int oper = scanner.nextInt();
        if(oper ==1){
            result = first+second;
            System.out.println(result);
        }else if (oper ==2){
            result= first-second;
            System.out.println(result);
        }else if(oper ==3){
            result = first*second;
            System.out.println(result);
        }else if(oper ==4){
            result = first/second;
            System.out.println(result);
        }else if (oper ==5){
            result = first%second;
            System.out.println(result);
        }
    else{
            System.out.println("오류입니다");
    }
}
}
