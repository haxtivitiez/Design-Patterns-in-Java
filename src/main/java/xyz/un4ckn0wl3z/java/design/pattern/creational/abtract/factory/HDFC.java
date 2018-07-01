package xyz.un4ckn0wl3z.java.design.pattern.creational.abtract.factory;

public class HDFC implements Bank{
    private final String BNAME;
    public HDFC(){
        BNAME="HDFC BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}
