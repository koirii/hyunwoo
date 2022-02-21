package org.zerock;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BMIService bmiService =new BMIService();
        BMIUI bmiui=new BMIUI(bmiService);

        bmiui.doJob();


    }
}
