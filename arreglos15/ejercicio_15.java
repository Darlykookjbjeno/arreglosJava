
package arreglos15;

import java.util.Scanner;


public class ejercicio_15 {
     public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
            
            boolean creciente=false;
            int contador=0,n;
            
            int[] numeros=new int[10];
            
            System.out.println("Ecriba los numeros");
            
            do{
                for(int i=0;i<numeros.length;i++){
                    numeros[i]=Lector.nextInt();
                }
                
                for(int i=0;i<9;i++){
                    if(numeros[i]<numeros[i+1]){
                        creciente=true;
                    }else{
                        creciente=false;
                    }
                }
                if(creciente == false){
                    System.out.println("los numeros no estan orcenados de forma creciente"); 
               }
     
            }while(creciente == false);
            
            System.out.println("Escriba el numero que quiere buscar");
            n=Lector.nextInt();
      
            
            int i=0;
            
            while(i<10 && numeros[i]<n){
                i++;
            }
            
            if(i==10){
                System.out.println("numero no encontrado");
            
            }else{
                if(numeros[i] == n){
                    System.out.println("numero encontrado, en la posicion: "+i);
                }else{
                    System.out.println("no encontrado");
                }
            }
          
            /*boolean encontrado=false;
            
            for(int i=0;i<numeros.length;i++){
                
                encontrado = (n == numeros[i]);
                    if(encontrado == true){
                        contador++;
                        System.out.println("El numero si se encuentra");
                        System.out.println("en la posicion "+contador);
                    }else{
                    System.out.println("El numero no se encuentra");
                    }
                    
                
            }*/
            
           
     }
            
}
