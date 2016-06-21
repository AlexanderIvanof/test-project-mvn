package com.luxoft.task;

public strictfp class Division implements Executable {

    @Override
    public double execute(double leftOperand, double rightOperand) {
        return leftOperand / rightOperand;
    }
}
