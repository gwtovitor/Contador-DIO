package edu.vitor.counter;


public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        System.out.println("O primeiro parâmetro deve ser menor ou igual ao segundo.");
    }
}