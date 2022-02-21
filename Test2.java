package org.zerock;

public class Test2 {
    public static void main(String[] args) {
        double best=0 ;
        double ticket=0;
        for (int i = 0; i < 50; i++) {//i가 50이면 티켓값이 0원이니 i는 50까지만 돌린다.
            
            double benefit =(5-(0.1*i))*(120+(15*i));
            double cost = 180+(0.04*(15*i));
            double result = benefit-cost;

            if(best<result){
                best = result;
                ticket = (5-(0.1*i));
            }

        }
        System.out.println("최대이익은"+best+"이고 그때의"+ticket+"달러가 티켓가격이다" );
    }
}
