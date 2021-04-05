package ru.netology.service;

public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        System.out.println(service.remain(amount));
    }
}
