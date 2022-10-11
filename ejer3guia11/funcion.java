
package ejer3guia11;


public class funcion {
    public boolean Funcion(String num1, String num2) {
        int numint1 = 0;
        int numint2 = 0;
        try {
            numint1 = Integer.parseInt(num1);
            numint2 = Integer.parseInt(num2);
            System.out.println(numint1 / numint2);
        } catch (ArithmeticException a) {
            System.out.println("No se puede dividir por 0");
            return false;
        } catch (NumberFormatException a) {
            System.out.println("Ingrese bien los numeros");
            return false;
        }
        return true;
    }
}
