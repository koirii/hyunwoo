package org.zerock;

import java.util.Scanner;

public class MenuMain {

    public static void main(String[] args) {
	// write your code here
        int min=1000000000;
        Menu menu = new Menu("짜장면",5000);
        Menu menu2 = new Menu("간짜장",6000);
        Menu menu3 = new Menu("짬뽕",7000);
        Menu menu4 = new Menu("울면",8000);
        Menu menu5 = new Menu("볶음밥",7500);

        Menu[] menus = new Menu[5];

        menus[0]= menu;
        menus[1]= menu2;
        menus[2]= menu3;
        menus[3]= menu4;
        menus[4]= menu5;

        Scanner scanner = new Scanner(System.in);
        Menu user = new Menu("없음",0);
        System.out.println("가지고있는 금액을 입력해주세요");
        user.cost = Integer.parseInt(scanner.nextLine());


        for (Menu arr:menus) {
            int result= user.cost- arr.cost;
            if(result<min && result>=0){
                min = result;
                user.name = arr.name;
            }
        }
        System.out.println(user);

    }
}
