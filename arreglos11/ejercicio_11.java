
package arreglos11;

import java.util.Scanner;


public class ejercicio_11 {
    
    public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
            
            int n,puesto=0,ultimo,j=0,contador=0;
            
            int[] numeros = new int[10];
            boolean creciente=false;
            
            do{
                for(int i=0;i<5;i++){
                    System.out.println("Escriba el valor #"+(i+1));
                    numeros[i]=Lector.nextInt();
                }
                for(int i=0;i<4;i++){
                    if(numeros[i]<numeros[i+1]){
                    creciente=true;
                    }
                    if(numeros[i]>numeros[i+1]){
                    creciente=false;
                    break;
                    }
                }
                
                if(creciente == false){
                    System.out.println("no esta arreglado");
                }

            }while(creciente == false);
            
            
            
            System.out.println("Escriba le numero quequiere poner:");
            n=Lector.nextInt();
            
            while(numeros[puesto]<n && j<5){
                    contador++;
                    puesto++;
            }

             
            for(int i=4;i>=contador;i--){
                numeros[i+1]=numeros[i];
            }
            
            numeros[contador]=n;
            
            
            System.out.println("Arreglos");
            
            for(int i=0;i<6;i++){
                System.out.println(numeros[i]);
            }
    }
}
