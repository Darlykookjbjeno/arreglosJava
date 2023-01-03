
package arreglos10;

import java.util.Scanner;


public class ejercicio_10 {
        public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
            
            int posicion,ultimo;
            int[] num =new int[10];
            
            for(int i=0;i<num.length;i++){
                System.out.println("escriba el valor #"+(i+1));
                num[i]=Lector.nextInt();
           }
            
            System.out.println("Escriba cuantas posiciones quiere desplazar");
            posicion=Lector.nextInt();
            
            
            for(int v=1;v<=posicion;v++){
                ultimo=num[9];
                    for(int i=8;i>=0;i--){
                        num[i+1]=num[i];
                    }
                    num[0]=ultimo;
            }
            
            System.out.println("Arreglo");
            
            
                for(int i=0;i<num.length;i++){
                    System.out.println(num[i]);
                }
            
    }
}
