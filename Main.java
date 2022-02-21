package org.zerock;

public class Main {

    public static void main(String[] args) {
	
        BMIService bmiService =new BMIService();
        BMIUI bmiui=new BMIUI(bmiService);

        bmiui.doJob();


    }
}
