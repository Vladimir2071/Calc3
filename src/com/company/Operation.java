package com.company;

public class Operation extends Token {
    private int priority;
    private int arity;      // arity operation, f.e. unary, binary etc

    public Operation(String value, int priority, int arity) {
        super(value);
        this.priority = priority;
        this.arity = arity;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getArity() {
        return arity;
    }

    public void setArity(int arity) {
        this.arity = arity;
    }
}
