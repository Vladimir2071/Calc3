package com.company;

public class Calculator {

    private String strExpr;

    public Calculator(String strExpr) {
        this.strExpr = strExpr;
    }

    public String getStrExpr() {
        return strExpr;
    }

    public void setStrExpr(String strExpr) {
        this.strExpr = strExpr;
    }

    public double calculate() {
        System.out.println(getStrExpr());
        return 0;
    }
}
