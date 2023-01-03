
package arreglos09;

import java.util.Scanner;


public class ejercicio_09 {
    public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
            
            int ultimo;
            int[] numero=new int[10];
            for(int i=0;i<numero.length;i++){
                System.out.println("Escriba el valor #"+(i+1));
                numero[i]=Lector.nextInt();
            }
            
            ultimo=numero[9];
            
            for(int i=8;i>=0;i--){
                numero[i+1]=numero[i];
            }
            System.out.println("arreglo");
            
            for(int i=0;i<numero.length;i++){
                System.out.println(numero[i]);
            }
    }
}
