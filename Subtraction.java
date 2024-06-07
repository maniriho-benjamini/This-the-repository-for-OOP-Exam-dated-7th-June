/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.codemulo.subtraction;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {

        int number1, number2, total;
        Scanner nn= new Scanner(System.in);
        number1 = (int) (Math.random() * 9);
        number2 = (int) (Math.random() * 9);
        System.out.println("number1:"+ number1);
        System.out.println("number2:"+ number2);


        if(number1<number2){

            System.out.println("Subtract "+ number2 +" -" + number1);
            System.out.println("Please enter the answer ");

            total=nn.nextInt();
            if((number2-number1)!=total){
                System.out.println("the answer entered  "+ total +" is not correct. The correct answer is "+(number2-number1) );
            } else{
                System.out.println("the answer entered  "+ total +" is correct" );
            }
        } else{
            System.out.println("Please enter the answer ");
            total=nn.nextInt();
            if((number2-number1)!=total){
                System.out.println("the answer entered  "+ total +" is not correct. The correct answer is "+(number1-number2) );
            } else{
                System.out.println("the answer entered  "+ total +" is correct" );
            }
        }
    }
}
