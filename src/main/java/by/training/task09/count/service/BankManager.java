package by.training.task09.count.service;

import by.training.task09.count.bean.Account;
import by.training.task09.count.bean.Client;
import by.training.task09.count.bean.Currency;

import java.math.BigInteger;
import java.util.ArrayList;


public class BankManager {
    private  ArrayList<Client> clients = new ArrayList<>();
    private  ArrayList<Account> bankAccounts = new ArrayList<>();
    public BankManager() {
        base();
    }


    private void base(){
        Client ivanov = new Client("Ivanov", "Ivan");
        ArrayList<Account> accountsOfIvanov = new ArrayList<>();
        accountsOfIvanov.add(new Account(5948, Currency.BYN,
                new BigInteger("123456789654"), 1, ivanov.getId()));
        accountsOfIvanov.add(new Account(2328, Currency.EURO,
                new BigInteger("123456987465"), 2.23, ivanov.getId()));
        accountsOfIvanov.add(new Account(5948, Currency.DOLLAR_USA,
                new BigInteger("12346879979546"), 2.04, ivanov.getId()));

        clients.add(ivanov);
        bankAccounts.addAll(accountsOfIvanov);

        Client petrov = new Client("Petrov", "Petr");
        ArrayList<Account> accountsOfPetrov = new ArrayList<>();
        accountsOfPetrov.add(new Account(6948, Currency.BYN,
                new BigInteger("123456789144"), 1, petrov.getId()));
        accountsOfPetrov.add(new Account(10428, Currency.EURO,
                new BigInteger("123456969465"), 2.23, petrov.getId()));
        accountsOfPetrov.add(new Account(9948, Currency.DOLLAR_USA,
                new BigInteger("12346109979546"), 2.04, petrov.getId()));

        clients.add(petrov);
        bankAccounts.addAll(accountsOfPetrov);
        Client sydorov = new Client("Sydorov", "Sydor");
        ArrayList<Account> accountsOfSydorov = new ArrayList<>();
        accountsOfSydorov.add(new Account(1148, Currency.BYN,
                new BigInteger("123456711144"), 1, sydorov.getId()));
        accountsOfSydorov.add(new Account(11128, Currency.EURO,
                new BigInteger("123411969465"), 2.23, sydorov.getId()));
        accountsOfSydorov.add(new Account(8511, Currency.DOLLAR_USA,
                new BigInteger("12346109911546"), 2.04, sydorov.getId()));
        accountsOfSydorov.add(new Account(850000, Currency.RUR,
                new BigInteger("12375109911326"), 0.04, sydorov.getId()));

        clients.add(sydorov);
        bankAccounts.addAll(accountsOfSydorov);
    }
    public  void euroAccount(){
        for (Account a : bankAccounts) {
            if(a.getCurrency() == Currency.EURO){
                System.out.println(a.getBalance() + " euro " + a.getNumOfAccount());
            }
        }
    }
    public  void dollarAccount(){
        for (Account a : bankAccounts) {
            if(a.getCurrency() == Currency.DOLLAR_USA){
                System.out.println(a.getBalance() + " dollar USA " + a.getNumOfAccount());
            }
        }
    }
    public  void BYNAccount(){
        for (Account a : bankAccounts) {
            if(a.getCurrency() == Currency.BYN){
                System.out.println(a.getBalance() + " BYN " + a.getNumOfAccount());
            }
        }
    }
    public  void RURAccount(){
        for (Account a : bankAccounts) {
            if(a.getCurrency() == Currency.RUR){
                System.out.println(a.getBalance() + " RUR " + a.getNumOfAccount());
            }
        }
    }
    public void wholeSumAccounts(){

        double sum = 0;

        for (Account a : bankAccounts) {

                sum += a.getBalance() * a.getExchangeCourse();

        }
        System.out.println("Sum of all accounts is " + sum);
    }
    public void sumPositiveAccounts(){

        double sum = 0;

        for (Account a : bankAccounts) {
            if(a.getBalance() > 0) {
                sum += a.getBalance() * a.getExchangeCourse();
            }
        }
        System.out.println("Sum of all positive accounts is " + sum);
    }
    public void sumNegativeAccounts(){

        double sum = 0;

        for (Account a : bankAccounts) {
            if(a.getBalance() < 0) {
                sum += a.getBalance() * a.getExchangeCourse();
            }
        }
        System.out.println("Sum of all negative accounts is " + sum);
    }
    public void searchCerainAccount(BigInteger bigInteger){

        for (Account a : bankAccounts) {

            if(a.getNumOfAccount().equals(bigInteger)){
                System.out.println(a.getBalance() + " " +
                        a.getCurrency() + " # " + a.getNumOfAccount()
                + " " + a.getIdOfClient());
            }
        }
    }
    public void searchAccountOfCertainClient(int i){

        for (Account a : bankAccounts) {

            if(a.getIdOfClient() == i){

                System.out.println(a.getBalance() + " " +
                        a.getCurrency() + " # " + a.getNumOfAccount());
            }
        }
    }
}
