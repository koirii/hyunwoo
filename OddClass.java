package org.zerock;

public class OddClass {
    public static void main(String[] args) {
        int v1 =(int) (Math.random()*1000);
        System.out.println(v1);
        int v2 = v1%2;
        if(v1==1){
            System.out.println("홀수");
        }else{
            System.out.println("짝수");
    }
    }
}
