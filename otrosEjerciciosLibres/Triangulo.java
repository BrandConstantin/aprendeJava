/**
 * @author costy
 * 
 *  Hallar el área del triángulo introduciendo los valores de los lados por teclado
 */
import java.util.Scanner;

public class Triangulo {
    public static void main (String args[]){
        
        Scanner dato = new Scanner( System.in );
        
        float n1;
        float n2;
        float n3;
        float sp;
        double miArea;
        
        System.out.println("Introduzca el valor del primer lado del triángulo: ");
        n1 =dato.nextFloat();   // introducimos el primer lado del triangulo
        System.out.println("Introduzca el valor del segundo lado del triángulo: ");
        n2 = dato.nextFloat();  // introducimos el segundo lado del triangulo
        System.out.println("Introduzca el valor del tercer lado del triángulo: ");
        n3 = dato.nextFloat();  // introducimos el tercer lado del triangulo
        
        sp = (n1 + n2 + n3) / 2;
        miArea = Math.sqrt(sp * (sp - n1) * (sp - n2) * (sp - n3));
        
        System.out.printf("El área del triángulo de lado: %.1f x %.1f x %.1f es igual a: %.2f\n", n1, n2, n3, miArea);
    }
}