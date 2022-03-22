package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char letraA = 'a', letraE = 'e', letraI = 'i', letraO = 'o', letraU = 'u';
        String texto;
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una frase (intro para terminar): ");
        texto = entrada.nextLine();


        for (int i = 0; i < texto.length(); i++) {
            if (texto.toLowerCase().charAt(i) == letraA) {
                contadorA++;
            }
        if (texto.toLowerCase().charAt(i) == letraE) {
            contadorE++;
        }
        {
            if (texto.toLowerCase().charAt(i) == letraI)
                contadorI++;
        }
        if (texto.toLowerCase().charAt(i) == letraO) {
            contadorO++;
        }
        if (texto.toLowerCase().charAt(i) == letraU) {
            contadorU++;
        }
    }
            System.out.println("Número de veces que aparece el carácter " + letraA + " : " + contadorA);
            System.out.println("Número de veces que aparece el carácter " + letraE + " : " + contadorE);
            System.out.println("Número de veces que aparece el carácter " + letraI + " : " + contadorI);
            System.out.println("Número de veces que aparece el carácter " + letraO + " : " + contadorO);
            System.out.println("Número de veces que aparece el carácter " + letraU + " : " + contadorU);

        }
    }

