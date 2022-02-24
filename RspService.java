package org.zerock;

import java.util.Random;

public class RspService {
    boolean rsp ;
    public boolean rsp(int user) {


        Random random = new Random();
        int userwin = 0;
        int comwin = 0;



            if (user == 0) {
                System.out.println("가위");
            } else if (user == 1) {
                System.out.println("바위");
            } else if (user == 2) {
                System.out.println("보");
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
                    System.out.println("비겼습니다 현재" + comwin + "번 컴퓨터승리" + userwin + "번 유저승리");
                    break;
                case 1:
                    comwin++;
                    System.out.println("컴승리 현재" + comwin + "번 컴퓨터승리" + userwin + "번 유저승리");

                    break;
                case 2:
                    userwin++;
                    System.out.println("유저승리 현재" + comwin + "번 컴퓨터승리" + userwin + "번 유저승리");

                    break;
            }
            if (comwin == 1) {
                rsp =false;
            }
            else if (userwin == 1) {
                rsp =true;
            }
            return rsp;


    }

}
