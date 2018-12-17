package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        double result;
        String strExpr = "(-55.4+8*(12-7))*12-120*(-2)/4+29*2.5";

        Calculator calc = new Calculator(strExpr);
        result = calc.calculate();
        System.out.println("Result: " + strExpr + " = " + result);

    }

    /* ============================================================
    load permitted operations
    ============================================================ */
    //
//    private static HashMap<String, Operation> LoadOperation() {
//        HashMap<String, Operation> hmOperation = new HashMap<>();
//
//        hmOperation.put("+", new Operation("+", TypeToken.OPERATION,2,2)); // binary add
//        hmOperation.put("-", new Operation("-", TypeToken.OPERATION,2,2));// binary minus
//        hmOperation.put("*", new Operation("*", TypeToken.OPERATION,3,2)); // binary add
//        hmOperation.put("/", new Operation("/", TypeToken.OPERATION,3,2));// binary minus
//        hmOperation.put("U+", new Operation("+", TypeToken.UNARY_OPERATION,4, 1)); // unary add
//        hmOperation.put("U-", new Operation("-", TypeToken.UNARY_OPERATION,4,1)); // unary minus
//
//        return hmOperation;
//    }
}
