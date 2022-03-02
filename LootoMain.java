package org.zerock;

public class LootoMain {
    public static void main(String[] args) {
        LootoService lootoService = new LootoService();
        LootoUi lootoUi= new LootoUi(lootoService);

        lootoUi.dojob();
    }
}
