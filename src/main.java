import java.util.Scanner;

public class main {

        public static void main(String[] args) {

            /* String thanks = "Thank you, ";
            String name = "miguel!";
            String order = "Your order number is #";
            int previousOrder = 715;
            System.out.println(thanks + name.toUpperCase());
            System.out.println(order + (previousOrder+1)); */
            
             Scanner wall = new Scanner(System.in);
             System.out.println("enter height in meters: ");
             int wallheight = wall.nextInt();

             System.out.println("Enter width in meters: ");
             int wallwidth = wall.nextInt();

             System.out.println("Enter number of walls: ");
             int numofwalls = wall.nextInt();

             System.out.println("Do you have windows and doors?:");
             boolean windows = wall.nextBoolean();

             

             int area = wallheight * wallwidth;
             System.out.println("The total area of your wall is: " + area + " m^2 per wall" + " a total of: " + (numofwalls*area));
             float estimatedPaint = (float) area / 12;
             System.out.println("With the estimate of 1 litre of paint covering 12 m^2, you will require: " + estimatedPaint +"litres of paint");
            

        }

    




}

