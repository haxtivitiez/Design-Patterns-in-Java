package xyz.un4ckn0wl3z.java.xyz.un4ckn0wl3z.java.design.pattern.creational.abtract.factory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        } else if(choice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }
        return null;
    }
}