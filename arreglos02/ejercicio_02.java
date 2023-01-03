
package arreglos02;

import java.util.Scanner;


public class ejercicio_02 {
    
    public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
    
            int[] numeros = new int[5];
            
            for(int i=0;i<numeros.length;i++){
                System.out.println("Digite el #"+(i+1));
                
                numeros[i]=Lector.nextInt();
            }
            
            for(int i=4;i>=0;i--){
                System.out.println(numeros[i]);
            }
    
    }
}
