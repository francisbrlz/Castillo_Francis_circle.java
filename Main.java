/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package castillo_francis_circlejava;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);


       System.out.println("Enter the radius of the Circle");
       double radcir= scanner.nextDouble();
       Circle CIRCLE= new Circle ();
       System.out.println("Here are the results:" );
       System.out.println("Area:" +CIRCLE.Area(radcir));
       System.out.println("Circumference:" +CIRCLE.Circumference(radcir));
       System.out.println("Diameter:" +CIRCLE.Diameter(radcir));
    }
}

