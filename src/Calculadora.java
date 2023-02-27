import exception.CalculadoraException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    //Atributos = Características
    private int primeiroValor = 0;
    private int segundoValor = 0;
    private String operador = "";

    //Métodos = Ações
    public void calcular(){

        try{
            capturarDadosDoUsuario();
            verificarOperadorNaoValido();
            somar();
            dividir();
            multiplicar();
            subtrair();
        }catch (ArithmeticException arithmeticException){
            throw new CalculadoraException("Ocorreu um erro ao tentar executar a operação matemática, segue erro: " + arithmeticException.getMessage());
        }catch (InputMismatchException inputMismatchException){
            throw new CalculadoraException("Insira um número válido, esse não é um número inteiro: " + inputMismatchException.getMessage());
        }
    }

    private void capturarDadosDoUsuario(){
        String operador;


        System.out.println("Insira o primeiro Valor");
        Scanner scanner = new Scanner(System.in);
        primeiroValor = scanner.nextInt();

        System.out.println("Insira o segundo Valor");
        segundoValor = scanner.nextInt();

        System.out.println("Insira o operador");
        this.operador = scanner.next();
    }


    private void somar(){
        if(operador.equals("+")){
            System.out.println("Isso é uma Adição");
            System.out.println(primeiroValor+segundoValor);
        }
    }

    private void multiplicar(){
        if(operador.equals("*")){
            System.out.println("Isso é uma Multiplicação");
            System.out.println(primeiroValor*segundoValor);
        }
    }

    private void subtrair(){
        if(operador.equals("-")){
            System.out.println("Isso é uma Subtração");
            System.out.println(primeiroValor-segundoValor);
        }
    }

    private void dividir(){
        if(operador.equals("/")){
            System.out.println("Isso é uma Divisão");
            System.out.println(primeiroValor/segundoValor);
        }
    }

    private void verificarOperadorNaoValido(){
        if(!operador.equals("/") & !operador.equals("+") & !operador.equals("*") & !operador.equals("-")){
            throw new CalculadoraException("Esse não é um operador válido");
        }
    }

    // Métodos Getters e Setters
    public int getPrimeiroValor() {
        return primeiroValor;
    }

    public void setPrimeiroValor(int primeiroValor) {
        this.primeiroValor = primeiroValor;
    }

    public int getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(int segundoValor) {
        this.segundoValor = segundoValor;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
}
