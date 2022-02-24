package org.zerock;

public class MainRsp {

    public static void main(String[] args) {
	// write your code here
        RspService rspService = new RspService();
        RspUI rspUi = new RspUI(rspService);
//현재 문제는 바위를 내면 바위로 유저값이 고정된채 3번돌아감

        rspUi.dojob();

    }
}
