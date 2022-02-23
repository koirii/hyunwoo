package org.zerock;

import java.util.Random;
import java.util.Scanner;

public class RSP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userwin = 0;
        int comwin = 0;
        for (int i = 0; comwin<3 && userwin<3; i++) {

            System.out.println("가위는0 바위는1 보는2");
            int user = Integer.parseInt(scanner.nextLine());
            if (user == 0) {
                System.out.println("가위");
            } else if (user == 1) {
                System.out.println("바위");
            } else if (user == 2) {
                System.out.println("보");
            } else {
                return;
            }
            int com = random.nextInt(3);
            if (com == 0) {
                System.out.println("가위");
            } else if (com == 1) {
                System.out.println("바위");
            } else if (com == 2) {
                System.out.println("보");
            }

            if (com < user) {
                com = com + 3;
            }
            int result = com - user;
            switch (result) {
                case 0:
                    System.out.println("비겼습니다 현재"+comwin+"번 컴퓨터승리"+userwin+"번 유저승리");
                    break;
                case 1:
                    System.out.println("컴승리 현재"+comwin+"번 컴퓨터승리"+userwin+"번 유저승리");
                    comwin++;
                    break;
                case 2:
                    System.out.println("유저승리 현재"+comwin+"번 컴퓨터승리"+userwin+"번 유저승리");
                    userwin++;
                    break;
            }
        } // end for i
        if (comwin ==3){
            System.out.println("컴퓨터 최종승리");
        }
        if (userwin==3){
            System.out.println("유저 최종승리");
        }
    }
}
