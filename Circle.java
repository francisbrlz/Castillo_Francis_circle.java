/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package castillo_francis_circlejava;

/**
 *
 * @author Student
 */
class Circle {
   private double radcir= 0.0;
     double Area =Math.PI*Math.pow(radcir, 2);
     double CIRCUMFERENCE =2*Math.PI*radcir;
     double diameter=2*radcir;
     double a;

    public Circle(){

    }

    
    
   double set_radcir(double a){
       return radcir=a;
   }
   double get_radcir(){
       return radcir;}

   double get_Diameter(){
       return diameter=a;}
   double set_diameter (double a){
   return radcir=a;}


   double Area(double radcir){
       return Math.PI*Math.pow(radcir, 2);
       //to get the area
   }
   double Diameter(double radcir){
       return 2*radcir;
       //to get the diameter

}
     double Circumference(double radcir){
       return 2*Math.PI*radcir;
       //ti get the circumference
   }
   double get_Circumference(){
       return CIRCUMFERENCE;
}
     void set_Area(double a){
       this.Area=a;
   }
   double get_Area(){
       return Area;
}




}


