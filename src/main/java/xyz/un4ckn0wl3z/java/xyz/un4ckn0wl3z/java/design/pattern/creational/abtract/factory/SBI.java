package xyz.un4ckn0wl3z.java.xyz.un4ckn0wl3z.java.design.pattern.creational.abtract.factory;

class SBI implements Bank{
    private final String BNAME;
    public SBI(){
        BNAME="SBI BANK";
    }
    public String getBankName(){
        return BNAME;
    }
}
