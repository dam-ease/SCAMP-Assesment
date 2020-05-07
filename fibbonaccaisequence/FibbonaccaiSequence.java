/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibbonaccaisequence;

import java.util.Scanner;

/**
 *
 * @author Damilola
 */
public class FibbonaccaiSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int a=0;
        int b=0;
        int c=1;
        Scanner bin=new Scanner(System.in);
        System.out.print("Enter the value for n: ");
        n=bin.nextInt();
        System.out.print("Fibbonaccai Sequence: ");
        for (int i = 1; i <= n; i++) {
            a=b;
            b=c;
            c=a+b;
            System.out.print(a+" ");
            
        }
        
    }
    
}
