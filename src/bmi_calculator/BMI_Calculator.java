/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_calculator;
import java.util.Scanner;
/**
 *
 * @author Jouri
 */
public class BMI_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

System.out.println("Hello Welcome To The BMI Calculator");
System.out.println("Please Enter Your Height :");
double height = scan.nextDouble();
System.out.println("Please Enter Your Weight :");
double weight = scan.nextDouble();


double BMI = (weight / (height*height));

        if (BMI<18.5) {
            System.out.println("Your BMI Is "+BMI+" , And Based On The Calculated BMI You Have (Underweight)");
        }
        else if(BMI>=18.5 && BMI<=24.9){
            System.out.println("Your BMI Is "+BMI+" , And Based On The Calculated BMI You Have (Normal Weight)");
        }
        else if(BMI>=25 && BMI<=29.9){
            System.out.println("Your BMI Is "+BMI+" , And Based On The Calculated BMI You Have (Overweight)");
        }
        else{
            System.out.println("Your BMI Is "+BMI+" , And Based On The Calculated BMI You Have (Obese)");
        }

    }
    
}
