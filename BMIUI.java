package org.zerock;

import java.util.Scanner;

public class BMIUI {
    BMIService service;
public BMIUI(BMIService service){
    this.service= service;
}
public void doJob() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("키를 cm로 입력해주세요");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("몸무게를 kg로 입력해주세요");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("이름을 입력해주세요");
        String name = scanner.nextLine();

        Person p1 =new Person(height,weight,name);
        double result =service.calculate(p1);
        System.out.println(result);

    }

}
