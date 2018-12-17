package com.company;

import java.util.ArrayDeque;

public class PreCompiler {
    private String strExpr;

    public PreCompiler(String strExpr) {
        this.strExpr = strExpr;
    }

    public String getStrExpr() {
        return strExpr;
    }

    public void setStrExpr(String strExpr) {
        this.strExpr = strExpr;
    }

    private String getAllowSymbols() {
        String str = "+-*/()";

        return str;
    }

    public boolean preComoile() {
        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        String str;
        String strAllow;
        char ch;
        boolean result = true;

        strAllow = getAllowSymbols();
        str = getStrExpr();
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (Character.isDigit(ch) || Character.isLetter(ch) || !(strAllow.indexOf(ch) == -1)) {
                System.out.println("Not allowed symbol '" + ch + "' in position # " + (i + 1));
                result = false;
            } else {
                if (ch == '(') {
                    stack.addLast(str.charAt(i));
                } else if (ch == ')') {
                    if (!stack.isEmpty()) {
                        stack.removeLast();
                    } else {
                        System.out.println("redundant ')' in position # " + (i + 1));
                        result = false;
                    }
                }
            }
        }

        if (stack.isEmpty() && result) {
            return true;
        }
        return false;
    }

}
