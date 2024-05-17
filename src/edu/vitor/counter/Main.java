package edu.vitor.counter;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParametrosInvalidosException {
        try {
            counter();
        } catch (ParametrosInvalidosException e) {
            throw  new ParametrosInvalidosException();
        }
    }

    public static void counter() throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero contador");
        int firstNumber = scanner.nextInt();
        System.out.println("Digite o Segundo numero contador");
        int secondNumber = scanner.nextInt();

        if(firstNumber > secondNumber) throw new ParametrosInvalidosException();

        Incrementacao(firstNumber, secondNumber);
    }

    public static void Incrementacao(int firstNumber, int secondNumber){
        int interacoes = secondNumber - firstNumber;
        System.out.println(interacoes);
        for(int i=0; i < interacoes; i++){
            System.out.println("Contador " + (i + 1));
        }
    }
}