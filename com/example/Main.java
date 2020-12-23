package com.example;

public class Main {
    public static void main(String[] args) {
        ApprovalPerson ishihara = new GeneralAffairs("石原");
        ApprovalPerson noguchi = new Manager("野口", 10);
        ApprovalPerson yamada = new GeneralManager("山田", 20);
        ApprovalPerson sato = new President("佐藤", 30);

        ishihara.setNext(noguchi).setNext(yamada).setNext(sato);

        DecisionRequest holiday = new DecisionRequest("有給申請書", 1);
        DecisionRequest retire = new DecisionRequest("退職届", 11);
        DecisionRequest hiring = new DecisionRequest("新卒採用申請書", 21);
        DecisionRequest strike = new DecisionRequest("ストライキ通知書", 99);

        ishihara.decision(holiday);
        ishihara.decision(retire);
        ishihara.decision(hiring);
        ishihara.decision(strike);
    }
}
