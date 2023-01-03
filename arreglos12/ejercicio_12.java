
package arreglos12;

import java.util.Scanner;

public class ejercicio_12 {
    
     public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
            
            int posicion,ultimo;
           int[] numeros=new int[10];
           boolean creciente=false;
           
           for(int i=0;i<numeros.length;i++){
                System.out.println("escriba el valor #"+(i+1));
                numeros[i]=Lector.nextInt();
           }
           
           
           
           do{
                System.out.println("Digite la posicion que quiere eliminar");
                posicion=Lector.nextInt();

           }while(posicion<0||posicion>9);
           
           for(int i=0;i<9;i++){
            numeros[i]=numeros[i+1];
           }
           
           System.out.println("arreglo");
           for(int i=0;i<9;i++){
               System.out.println(numeros[i]);
           }
           
           
            
           
           
           
     }
}
