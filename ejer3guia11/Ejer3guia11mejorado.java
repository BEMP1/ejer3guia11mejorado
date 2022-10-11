package ejer3guia11;

import java.util.Scanner;

public class Ejer3guia11mejorado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        funcion f = new funcion();
        String num1;
        String num2;
        do {
            num1 = leer.next();
            num2 = leer.next();
        } while (!f.Funcion(num1, num2));       
    }
}
