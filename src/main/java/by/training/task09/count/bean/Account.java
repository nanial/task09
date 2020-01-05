package by.training.task09.count.bean;

import java.io.Serializable;
import java.math.BigInteger;

public class Account  implements Serializable {

    private boolean isBlock;
    private long balance;
    private Currency currency;
    private BigInteger numOfAccount;
    private double exchangeCourse;
    private int idOfClient;

    public Account(long balance, Currency currency, BigInteger numOfAccount, double exchangeCourse, int idOfClient) {
        if(balance < 0) {
            isBlock = true;
        }
        this.balance = balance;
        this.currency = currency;
        this.numOfAccount = numOfAccount;
        this.exchangeCourse = exchangeCourse;
        this.idOfClient = idOfClient;
    }

    public int getIdOfClient() {
        return idOfClient;
    }

    public BigInteger getNumOfAccount() {
        return numOfAccount;
    }

    public double getExchangeCourse() {
        return exchangeCourse;
    }

    public boolean getIsBlock() {
        return isBlock;
    }

    public long getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setNumOfAccount(BigInteger numOfAccount) {
        this.numOfAccount = numOfAccount;
    }

    public void setExchangeCourse(double exchangeCourse) {
        this.exchangeCourse = exchangeCourse;
    }

    public void setIdOfClient(int idOfClient) {
        this.idOfClient = idOfClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;

        Account account = (Account) o;

        if (isBlock() != account.isBlock()) return false;
        if (getBalance() != account.getBalance()) return false;
        if (Double.compare(account.getExchangeCourse(), getExchangeCourse()) != 0) return false;
        if (getIdOfClient() != account.getIdOfClient()) return false;
        if (getCurrency() != account.getCurrency()) return false;
        return getNumOfAccount() != null ? getNumOfAccount().equals(account.getNumOfAccount()) : account.getNumOfAccount() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (isBlock() ? 1 : 0);
        result = 31 * result + (int) (getBalance() ^ (getBalance() >>> 32));
        result = 31 * result + (getCurrency() != null ? getCurrency().hashCode() : 0);
        result = 31 * result + (getNumOfAccount() != null ? getNumOfAccount().hashCode() : 0);
        temp = Double.doubleToLongBits(getExchangeCourse());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getIdOfClient();
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "isBlock=" + isBlock +
                ", balance=" + balance +
                ", currency=" + currency +
                ", numOfAccount=" + numOfAccount +
                ", exchangeCourse=" + exchangeCourse +
                ", idOfClient=" + idOfClient +
                '}';
    }
}
