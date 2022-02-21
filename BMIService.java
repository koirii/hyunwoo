package org.zerock;

public class BMIService {
    public double calculate(Person person){

        double bmi = person.weight/Math.pow ((person.height/100),2);
    return bmi;
    }
}
