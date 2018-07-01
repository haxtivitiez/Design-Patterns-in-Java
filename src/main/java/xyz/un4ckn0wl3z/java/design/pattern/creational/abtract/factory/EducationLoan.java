package xyz.un4ckn0wl3z.java.design.pattern.creational.abtract.factory;

public class EducationLoan extends Loan {
    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
