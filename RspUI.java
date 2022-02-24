package org.zerock;

import java.util.Scanner;

public class RspUI {
    RspService rspService = new RspService();
    public RspUI(RspService service){this.rspService=service;}


public void dojob(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("가위는0 바위는1 보는2");
    int user = Integer.parseInt(scanner.nextLine());
   boolean result=rspService.rsp(user);



    }
}
