/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresiones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author brand
 */
public class empieza_abc_mayu_minu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "Abc es un mensaje abc para todo el mundo";
        
        Pattern pat = Pattern.compile("^[aA]bc.+");
        Matcher mat = pat.matcher(cadena);
        
        if(mat.matches()){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
    
}