/*
 * De 7 en 7 descendente
 */
package tema.pkg0.b.condicionales.y.bucles;
import java.util.Scanner;
/**
 *
 * @author BrinCo
 */
public class De_7_en_7_Desc {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int x;
        
        System.out.println("Numeros de 7 en 7 hasta 100:");
        System.out.println("==================================");
        
        for(x = 100; x >= 0; x -= 7){
            System.out.print(x + " ");
        }
    }
}
