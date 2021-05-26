package com.mycompany.introducaojunitmdc;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class MainMdc {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        int a;
        int b;
        int resto;
        System.out.println("Digite o primeiro valor inteiro: ");
        a = dados.nextInt();
        System.out.println("Digite o segundo valor inteiro: ");
        b = dados.nextInt();

        while (b != 0) {
            resto = a % b;
            a = b;
            b = resto;
        }

        System.out.println("O mdc desses valores é: " + a);
        if (a == 1) {
            System.out.println("Os números são primos");
        } else {
            System.out.println("os números não são primos");
        }
    }
}
