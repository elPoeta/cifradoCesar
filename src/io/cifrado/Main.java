package io.cifrado;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        String cadena;
        int desplazamiento;
        Scanner leer = new Scanner(System.in);


        System.out.print("Ingrese cadena a cifrar ");
        cadena = leer.nextLine();
        System.out.print("Ingrese desplazamiento ");
        desplazamiento = leer.nextInt();
        System.out.println("Cadena Cifrada= "+CifradoCesar.cifrar(cadena, desplazamiento));

        System.out.println("");
        System.out.println("/////////////////////////////////////////");

        desplazamiento=1;
        String cadenita="Qg jmepyq tcp cqrc KCLQYHC, cqryq ayby tcx kyq acpay bc qcp BGMQ.";
        do{
            System.out.println("Descifrando => "+CifradoCesar.descifrar(cadenita, desplazamiento));
            desplazamiento++;
        }while(desplazamiento<26);
    }
}
