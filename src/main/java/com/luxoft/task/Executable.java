package com.luxoft.task;

/**
 * Each simple mathematical operation object has to implement this interface.
 */
public interface Executable {

    /**
     * Method should calculate mathematical operation and return result.
     *
     * @param leftOperand  left operand
     * @param rightOperand right operand
     * @return result of operation
     */
    double execute(double leftOperand, double rightOperand);
}
