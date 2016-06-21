package com.luxoft.task;

public strictfp class Multiplying implements Executable {

    @Override
    public double execute(double leftOperand, double rightOperand) {
        return leftOperand * rightOperand;
    }
}
