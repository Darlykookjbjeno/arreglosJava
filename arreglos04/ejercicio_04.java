
package arreglos04;

import java.util.Scanner;

public class ejercicio_04 {
    
         public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
            
            int[] numeros=new int[10];
            
            for(int i=0;i<numeros.length;i++){
            
                System.out.println("Escriba e digito #"+(i+1));
                numeros[i]=Lector.nextInt();
                
            }
            
             for(int i=0;i<5;i++){
                 System.out.println(numeros[i]+" "+numeros[9-i]);
                 
             }
             
     
        }
}
