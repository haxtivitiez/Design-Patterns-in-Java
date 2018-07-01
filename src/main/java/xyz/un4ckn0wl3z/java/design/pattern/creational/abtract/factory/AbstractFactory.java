package xyz.un4ckn0wl3z.java.design.pattern.creational.abtract.factory;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
