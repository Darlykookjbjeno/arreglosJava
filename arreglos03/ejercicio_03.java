
package arreglos03;

import java.util.Scanner;


public class ejercicio_03 {
    
     public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
     
            float sumaP=0, sumaN=0;
            int contadorPositivos=0, contadorNegativos=0,contador=0;
            int[] numeros=new int[5];
            
            for(int i=0; i<numeros.length;i++){
                System.out.println("Escriba el digito #"+(i+1));
                numeros[i]=Lector.nextInt();
            }
            
            for(int i=0;i<numeros.length;i++){
            
                if(numeros[i]>0){
                    contadorPositivos++;
                    
                    sumaP = (sumaP + numeros[i])/contadorPositivos;
                }
                if(numeros[i]<0){
                    contadorNegativos++;
                    
                    sumaN = (sumaN +numeros[i])/contadorNegativos;
                }
                if(numeros[i]==0){
                    contador++;
                }
            }
            
            System.out.println("La media de los numeros positivos es: "+sumaP);
            System.out.println("La media de los numeros negativos es: "+sumaN);
            System.out.println("hay: "+contador+ " ceros");
     
    }
}
