package xyz.un4ckn0wl3z.java.design.pattern.creational.factory.method;

public abstract class Plan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
