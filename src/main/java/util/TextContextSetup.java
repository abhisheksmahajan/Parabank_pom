package util;

import Pages.PageObjectManager;

public class TextContextSetup {

    public Base base;
    public PageObjectManager pom;


    public TextContextSetup(){
        base =new Base();
        pom=new PageObjectManager(base.initializeDriver());
    }
    public PageObjectManager Setup(){
        return pom;
    }
}
