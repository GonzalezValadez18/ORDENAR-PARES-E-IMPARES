/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package separapyi;

import java.util.Random;

/**
 *
 * @author Angel
 */
public class SEPARAPYI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p=0,im=0; 
        System.out.println("NUMEROS SIN SEPARAR NI ORDENAR\n");
        Random R=new Random();
        int Aleatorios[]=new int [20];
        for (int i = 0; i < 20; i++) {
            Aleatorios[i] = R.nextInt(99)+1;
        }
        for (int i = 0; i < 20; i++) {
           
             System.out.print(Aleatorios[i]+",");
        if (Aleatorios[i]%2==0) {
            p++;
        }
        else{
            im++;
        }            
        }
        int par[]=new int[p];
        int impar[]=new int[im];
        
        p=0;
        im=0;
        for (int i = 0; i < 20; i++) {
            if(Aleatorios[i]% 2==0){
                par[p]=Aleatorios[i];
                p++;
            }
            else{
                impar[im]=Aleatorios[i];
                im++;
            }
            
        }
        System.out.println("\n\nLOS NUMEROS SEPARADOS Y ORDENADOS QUEDAN ASI(PARES E IMPARES): ");
        System.out.print("\n");
        for(int i=0;i<p;i++){
            System.out.print(par[i]+"-");
        }
        System.out.print("");
        for(int i=0;i<im;i++){
            System.out.print(impar[i]+"-");
        }
        System.out.println("\n");
    }
    
}
