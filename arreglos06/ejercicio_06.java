
package arreglos06;

import java.util.Scanner;


public class ejercicio_06 {
    
    public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
    
         
            
            int[] A=new int[12];
            int[] B=new int[12];
            int[] C=new int[24];
            
            System.out.println("Tabla #1");
            for(int i=0;i<A.length;i++){
                System.out.println("Escriba el Valor #"+(i+1));
                A[i]=Lector.nextInt();
            }
            for(int i=0;i<B.length;i++){
            System.out.println("Escriba el Valor #"+(i+1));
                B[i]=Lector.nextInt();
            }
            
           
            int j=0,i=0;

            
            while(i<12){
                for(int k=0;k<3;k++){
                    C[j]=A[i+k];
                    j++;
                }
                for(int k=0;k<3;k++){
                    C[j]=B[i+k];
                    j++;
                }
            }
            i+=3;
            
            for(i=0;i<C.length;i++){
            
                System.out.println(C[i]);
            }
    
    }
}
