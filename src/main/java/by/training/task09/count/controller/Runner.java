package by.training.task09.count.controller;

//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность
// блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
// Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
// имеющим положительный и отрицательный балансы отдельно

import by.training.task09.count.service.BankManager;

import java.math.BigInteger;

public class Runner {

    public static void main(String[] args) {

        BankManager belarusBank = new BankManager();
        belarusBank.euroAccount();
        belarusBank.BYNAccount();
        belarusBank.dollarAccount();
        belarusBank.RURAccount();
        belarusBank.wholeSumAccounts();
        belarusBank.sumNegativeAccounts();
        belarusBank.sumPositiveAccounts();
        belarusBank.searchCerainAccount(new BigInteger("123456711144"));
        System.out.println();
        belarusBank.searchAccountOfCertainClient(1);
    }
}
