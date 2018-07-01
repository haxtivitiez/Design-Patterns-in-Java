package xyz.un4ckn0wl3z.java.design.pattern.creational.abtract.factory;

public class ICICI implements Bank{
    private final String BNAME;
    ICICI(){
        BNAME="ICICI BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}
