import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

      public static void main(String[] args) {
            Calculadora calculadora = new Calculadora();
            calculadora.calcular();
      }

      // Calculadora Abaixo não Orientada a Objetos.
      static void iniciarCalculadora(){

            try{
                  int primeiroValor;
                  int segundoValor;
                  String operador;

                  System.out.println("Insira o primeiro Valor");
                  Scanner scanner = new Scanner(System.in);
                  primeiroValor = scanner.nextInt();


                  System.out.println("Insira o segundo Valor");
                  segundoValor = scanner.nextInt();

                  System.out.println("Insira o operador");
                  operador = scanner.next();

                  somar(primeiroValor,segundoValor,operador);
                  subtrair(primeiroValor,segundoValor,operador);
                  dividir(primeiroValor,segundoValor,operador);
                  multiplicar(primeiroValor,segundoValor,operador);
                  verificarOperadorNaoValido(operador);

            }catch (ArithmeticException arithmeticException){
                  System.out.println("Erro ao tentar dividir: Não é possível dividir por Zero, favor digitar um número diferente");
            }catch (InputMismatchException inputMismatchException){
                  System.out.println("Insira um número válido, esse não é um número inteiro");
            }
      }

      static void somar(int primeiroValor, int segundoValor, String operador){
            if(operador.equals("+")){
                  System.out.println("Isso é uma Adição");
                  System.out.println(primeiroValor+segundoValor);
            }
      }

      static void subtrair(int primeiroValor, int segundoValor, String operador){
            if(operador.equals("-")){
                  System.out.println("Isso é uma Subtração");
                  System.out.println(primeiroValor-segundoValor);
            }
      }

      static void dividir(int primeiroValor, int segundoValor, String operador){
            if(operador.equals("/")){
                  System.out.println("Isso é uma Divisão");
                  System.out.println(primeiroValor/segundoValor);
            }
      }

      static void multiplicar(int primeiroValor, int segundoValor, String operador){
            if(operador.equals("*")){
                  System.out.println("Isso é uma Multiplicação");
                  System.out.println(primeiroValor*segundoValor);
            }
      }

      static void verificarOperadorNaoValido(String operador){
            if(!operador.equals("/") & !operador.equals("+") & !operador.equals("*") & !operador.equals("-")){
                  System.out.println("Esse não é um operador válido");
            }
      }
}