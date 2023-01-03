
package arreglos07;

import java.util.Scanner;


public class ejercicio_07 {
   
     public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
     
            int[] num = new int[10];
            boolean creciente=false,decreciente=false;
            
            for(int i=0;i<num.length;i++){
                System.out.println("Escribe el valor #"+(i+1));
                num[i]=Lector.nextInt();
            }
            
     
            for(int i=0;i<9;i++){
                if(num[i]<num[i+1]){
                    creciente=true;
                }
                if(num[i]>num[i+1]){
                    decreciente=true;
                }
            }
            if(creciente ==true && decreciente==false){
                System.out.println("Los numeros estan arreglados de forma creciente");
            }else if(creciente==false && decreciente==true){
                System.out.println("Los numeros estan arreglados de forma decreciente");
            }else if(creciente==true && decreciente==true){
                System.out.println("Los numeros estan arreglados de forma desordenada");
            }else if(creciente==false && decreciente==false){
                System.out.println("Los numeros estan arreglados de forma desordenada");
            }
     }
}
