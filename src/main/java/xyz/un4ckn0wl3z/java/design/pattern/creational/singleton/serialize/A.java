package xyz.un4ckn0wl3z.java.design.pattern.creational.singleton.serialize;

import java.io.Serializable;

public class A implements Serializable {
    //your code of singleton
    private static A obj=new A();//Early, instance will be created at load time
    private A(){}
    public static A getA(){
        return obj;
    }

    protected Object readResolve() {
        return getA();
    }

}
