import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
/**
 Coleman Strauss
 GPA Calculator
 March 12, 2015
 */
public class GPACalculator
{
    public static void main (String[] args) 
    {
        int numClasses;
        Scanner scan = new Scanner(System.in);
        double[] myArrayGrades;
        double sumGPA = 0;
        double GPA = 0;
        
        System.out.println("Please enter in the amount of classes you have: ");
        numClasses = scan.nextInt();
        
        myArrayGrades = new double[numClasses];
       
        
        for (int i=0; i < numClasses; i++) {
            System.out.println("Please enter grade for class " + (i + 1));
            myArrayGrades[i] = scan.nextDouble();
            
            if (myArrayGrades[i] >= 97) {
                System.out.println("Is this class an AP? Enter 'yes' or 'no'");
                String AP = scan.next();
                 if(AP.equals("no")) {
                  myArrayGrades[i] = 4.3;
                 }
                 else{
                  myArrayGrades[i] = 4.6;
                }
            }
            else if (myArrayGrades[i] >= 93) {
                System.out.println("Is this class an AP? Enter 'yes' or 'no'");
                String AP = scan.next();
                 if(AP.equals("no")) {
                  myArrayGrades[i] = 4.0;
                 }
                 else{
                  myArrayGrades[i] = 4.3;
                }
            }
            else if (myArrayGrades[i] >= 90) {
               System.out.println("Is this class an AP? Enter 'yes' or 'no'");
               String AP = scan.next();
                if(AP.equals("no")) {
                 myArrayGrades[i] = 3.7;
                }
                else{
                 myArrayGrades[i] = 4.0;
               }
            }
            else if (myArrayGrades[i] >= 87) {
               System.out.println("Is this class an AP? Enter 'yes' or 'no'");
                String AP = scan.next();
                 if(AP.equals("no")) {
                  myArrayGrades[i] = 3.3;
                 }
                 else{
                  myArrayGrades[i] = 3.6;
                }
            }
            else if (myArrayGrades[i] >= 83) {
                System.out.println("Is this class an AP? Enter 'yes' or 'no'");
                String AP = scan.next();
                 if(AP.equals("no")) {
                  myArrayGrades[i] = 3.0;
                 }
                 else{
                  myArrayGrades[i] = 3.3;
                }
            }
            else if (myArrayGrades[i] >= 80) {
                System.out.println("Is this class an AP? Enter 'yes' or 'no'");
                String AP = scan.next();
                 if(AP.equals("no")) {
                  myArrayGrades[i] = 2.7;
                 }
                 else{
                  myArrayGrades[i] = 3.0;
                }
            }
            else if (myArrayGrades[i] >= 77) {
                System.out.println("Is this class an AP? Enter 'yes' or 'no'");
                String AP = scan.next();
                 if(AP.equals("no")) {
                  myArrayGrades[i] = 2.3;
                 }
                 else{
                  myArrayGrades[i] = 2.6;
                }
            }
             else if (myArrayGrades[i] >= 73) {
               System.out.println("Is this class an AP? Enter 'yes' or 'no'");
                String AP = scan.next();
                 if(AP.equals("no")) {
                  myArrayGrades[i] = 2.0;
                 }
                 else{
                  myArrayGrades[i] = 2.3;
                }
            }
            else if (myArrayGrades[i] >= 70) {
               System.out.println("Is this class an AP? Enter 'yes' or 'no'");
                String AP = scan.next();
                 if(AP.equals("no")) {
                  myArrayGrades[i] = 1.7;
                 }
                 else{
                  myArrayGrades[i] = 2.0;
                }
            }
            else if (myArrayGrades[i] >= 67) {
                System.out.println("Is this class an AP? Enter 'yes' or 'no'");
                String AP = scan.next();
                 if(AP.equals("no")) {
                  myArrayGrades[i] = 1.3;
                 }
                 else{
                  myArrayGrades[i] = 1.6;
                }
            }
            else if (myArrayGrades[i] >= 63) {
                System.out.println("Is this class an AP? Enter 'yes' or 'no'");
                String AP = scan.next();
                 if(AP.equals("no")) {
                  myArrayGrades[i] = 1.0;
                 }
                 else{
                  myArrayGrades[i] = 1.3;
                }
            }
            else if (myArrayGrades[i] >= 60) {
                System.out.println("Is this class an AP? Enter 'yes' or 'no'");
                String AP = scan.next();
                 if(AP.equals("no")) {
                  myArrayGrades[i] = 0.7;
                 }
                 else{
                  myArrayGrades[i] = 1.0;
                }
            }
            else {
                myArrayGrades[i] = 0.0;
            }
        }
            
        for (double i : myArrayGrades) {
            sumGPA += i;
        }
        
        System.out.println("The sum of the GPA's is: " + sumGPA);
        
        GPA = sumGPA / numClasses;
        
        System.out.println("Your GPA is: " + GPA);
    }
}