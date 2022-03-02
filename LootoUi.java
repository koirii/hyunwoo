package org.zerock;

import java.util.Arrays;
import java.util.Scanner;

public class LootoUi {
    LootoService lootoService;
public LootoUi(LootoService lootoService) {this.lootoService=lootoService;}
public void dojob(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("복권을 살횟수를 입력해주세요 장당 천원입니다");
    int user= Integer.parseInt(scanner.nextLine());
    int cost = user*1000;

    int[][] result=lootoService.raffle(user);

    System.out.println("당신이 산복권은 아래와 같습니다");
    System.out.println(Arrays.deepToString(result));
    System.out.println("비용은"+cost+"입니다");

}
}
