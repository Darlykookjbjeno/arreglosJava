
package arreglos08;

import java.util.Scanner;


public class ejercicio_08 {
    public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
    
            int n,posicion;
            int[] num = new int[10];
            
            for(int i=0;i<8;i++){
                System.out.println("Escribe el valor #"+(i+1));
                num[i]=Lector.nextInt();
            }
            System.out.println("Escriba un numero: ");
            n = Lector.nextInt();
            System.out.println("Escriba un posicion: ");
            posicion = Lector.nextInt();
            
            for(int i=7;i>=posicion;i--){
                num[i+1]=num[i];
            }
            num[posicion]=n;
            
            
            System.out.println("El nuevo arreglo es: ");
            for(int i=0;i<9;i++){
                System.out.println(num[i]);
            }
    }
}
