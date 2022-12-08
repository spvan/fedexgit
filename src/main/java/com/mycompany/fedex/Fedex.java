/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fedex;

/**
 *
 * @author spvan_92fxbhk
 */
public class Fedex {
    public static void main(String args[]){
        int distance = 0;
        if (distance < 5) {
            System.out.println("$2");
        }else if (distance < 10){
            System.out.println("$5");
            
        }else if(distance < 20){
            System.out.println("$9");
        }else{
            System.out.println("$15");
        }
    }
    
}
