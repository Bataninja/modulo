package com.mycompany.calcularmodulo;
import java.util.Scanner;

public class CalcularModulo {

    public static int CalcularModulo(int n1, int n2){
        return n1 % n2;
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero1 = lector.nextInt();
        int numero2 = lector.nextInt();
        int resultado = CalcularModulo(numero1,numero2);
        System.out.println("El módulo es: " + resultado);
    }
}
