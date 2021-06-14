import java.util.Scanner;

public class main {

        public static void main(String[] args) {

            /* String thanks = "Thank you, ";
            String name = "miguel!";
            String order = "Your order number is #";
            int previousOrder = 715;
            System.out.println(thanks + name.toUpperCase());
            System.out.println(order + (previousOrder+1)); */
            paintNeeded(5,3);
            Scanner wall = new Scanner(System.in);

        }

         static void paintNeeded(int height, int width){
             //Scanner wall = new Scanner(System.in);
             // System.out.println("enter height")
             // int wallheight = wall

             int area = height * width;
             System.out.println("The total area of your wall is: " + area + " m^2 per wall");
             float estimatedPaint = (float) area / 12;
             System.out.println("With the estimate of 1 litre of paint covering 12 m^2, you will require: " + estimatedPaint + " litres of paint");
            }




}

