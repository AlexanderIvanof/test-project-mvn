package com.luxoft.task;

import java.util.ArrayDeque;
import java.util.Deque;

public final class MathOperationExecutor {

    private Deque<Executable> operations;

    private MathOperationExecutor() {
        operations = new ArrayDeque<>();
    }

    private MathOperationExecutor(Deque<Executable> operations) {
        this.operations = operations;
    }

    public static MathOperationExecutor getInstance() {
        return new MathOperationExecutor();
    }

    public static MathOperationExecutor getInstance(Deque<Executable> operations) {
        return new MathOperationExecutor(operations);
    }

    public boolean addOperation(Executable operation) {
        return operations.add(operation);
    }

    public double executeLast(double leftOperand, double rightOperand) {
        Executable operationToExecute = operations.pollLast();
        return operationToExecute.execute(leftOperand, rightOperand);
    }

    public double executeFirst(double leftOperand, double rightOperand) {
        Executable operationToExecute = operations.pollFirst();
        return operationToExecute.execute(leftOperand, rightOperand);
    }
}
