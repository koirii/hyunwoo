package org.zerock;

import java.util.Scanner;




public class DiceGame {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
        System.out.println("사용자주사위를 굴리겠습니까?");
        System.out.println(s.nextLine());
    int userNumber = (int) (Math.random() * 5);
        System.out.println(++userNumber);
        System.out.println("컴퓨터 주사위를 굴리세요");
        System.out.println(s.nextLine());
    int comNumber = (int) (Math.random()*5 );
        System.out.println(++comNumber);
        if (userNumber > comNumber) {
        System.out.println("사용자승리");
    } else if (comNumber > userNumber) {
        System.out.println(("컴퓨터 승리"));
    } else {
        System.out.println("무승부");
    }
  }
}
