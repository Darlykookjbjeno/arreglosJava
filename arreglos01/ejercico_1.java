
package arreglos01;

import java.util.Scanner;


public class ejercico_1 {
    
    public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
    
            int cantidad;
            
            int[] numeros = new int[5];
            
            for(int i=0;i<5;i++){
            
                System.out.println("escriba el digito #"+(i+1));
                numeros[i]=Lector.nextInt();
            }
            
            for(int i=0;i<numeros.length;i++){
                System.out.println(numeros[i]);
            }
    
    }
}
