package com.luxoft.task;

public class Main {

    public static void main(String[] args) {
        MathOperationExecutor mathOperationExecutor = MathOperationExecutor.getInstance();
        mathOperationExecutor.addOperation(new Division());
        mathOperationExecutor.addOperation(new Subtraction());

        System.out.println(mathOperationExecutor.executeFirst(1, 0));
        System.out.println(mathOperationExecutor.executeLast(3, 3));
    }
}
