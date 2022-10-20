package exemplos;

import java.util.Scanner;

public class Teste2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu nome :");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome);
        sc.close();
    }
}
