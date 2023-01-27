/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test1;
import java.util.Scanner;
/**
 * hello there
 * @author Tristan
 */
public class ReverseWord {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in );
        System.out.println ("Enter a word"); 
        String word = input.nextLine();
        char[] wordarray = word.toCharArray();
        for (int i = wordarray.length-1 ; i >= 0; i--) {
            System.out.print (wordarray[i]);
        }
        System.out.println("hi");
      
        
        
    }
    
}
