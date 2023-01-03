package arreglos14;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOMEPC
 */
public class ejercicio_14_1 {
    
    public static void main(String[] args){
            Scanner Lector= new Scanner(System.in);
    
            boolean creciente=false,decreciente=false;
            
            int[] a=new int[10];
            int[] b=new int[10];
            int[] c=new int[20];
            
            do{
                System.out.println("escriba los numeros arreglo #1");
                for(int i=0;i<10;i++){
                    
                    a[i]=Lector.nextInt();
                }
                for(int i=0;i<9;i++){
                    if(a[i]<a[i+1]){
                        creciente=true;
                    }else{
                        creciente=false;
                    }
                }
                
                if(creciente==false){
                    System.out.println("No estan organizados creciente mente");
                }
   
            }while(creciente==false);
            
            
            
            do{
                System.out.println("escriba los numeros arreglo #2");
                for(int i=0;i<10;i++){
                    
                    b[i]=Lector.nextInt();
                }
                for(int i=0;i<9;i++){
                    if(b[i]<b[i+1]){
                        creciente=true;
                    }else{
                        creciente=false;
                    }
                }
                
                if(creciente==false){
                    System.out.println("No estan organizados creciente mente");
                }
   
            }while(creciente==false);
            
            System.out.println("Vector final");
            
            
            int j=0,i=0,k=0;

                while(i<10 && j<10){
                    if(a[i]<b[j]){
                        c[k]=a[i];
                        i++;
                    }else{
                        c[k] =b[j];
                        j++;
                    }
                    k++;
                }
                
                if(i==10){
                    while(j<10){
                        c[k]=b[j];
                        j++;
                        k++;
                    }
                }else{
                    while(i<10){
                        c[k]=a[i];
                        i++;
                        k++;
                        
                    }
                }
                
                System.out.println("Vector tres");
                for( k=0;k<c.length;k++){
                    System.out.println(c[k]);
                }
                
            
            
    }
}
