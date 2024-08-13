package desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();
            contar(parametroUm, parametroDois);
        }catch(InputMismatchException e){
            System.out.println("O parâmetro deve ser um número");
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número "+i);
        }
    }
}