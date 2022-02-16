package org.zerock;

import java.util.Scanner;

public class GetUserNumber

 {public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("화면에 숫자를 입력해주세요");
     int input = scanner.nextInt();
     System.out.println("당신이 입력한 숫자는"+ input);

 }
}
