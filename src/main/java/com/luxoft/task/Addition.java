package com.luxoft.task;

public class Addition implements Executable {

    @Override
    public strictfp double execute(double leftOperand, double rightOperand) {
        return leftOperand + rightOperand;
    }
}
