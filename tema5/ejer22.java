/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author costy
 */

public class ejer22 {
  public static void main(String[] args) {
    
    boolean primo = true;
    //int i;
    //int b;
    
    for (int i = 2; i <= 100; i++){
        primo = true;
        for (int b = 2; b < i; b++){
            if ((i % b) == 0) primo = false;
        }
        if (primo){
            System.out.println(i + "");
        }
    }
    System.out.println();
  }
}