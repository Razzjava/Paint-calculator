import java.util.Scanner;

public class Main {


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

             System.out.println("Do you have any windows?:");
             boolean windows = wall.nextBoolean();

             int area = wallheight * wallwidth;

             if (!windows){
             
             System.out.println("The total area of your wall is: " + area + " m^2 per wall" + " a total of: " + (numofwalls*area));
             float estimatedPaint = (float) area / 12;
             System.out.println("With the estimate of 1 litre of paint covering 12 m^2, you will require: " + estimatedPaint +"litres of paint");
             } else {
                int allwindows = howmanywindows();
                System.out.println("what height are your windows (m)?: ");
                int heightofWindows = wall.nextInt();
                System.out.println("what width are your windows (m)?: ");
                int widthofWindows = wall.nextInt();
                int areaofWindows = heightofWindows * widthofWindows; 
                int totalArea = areaofWindows * allwindows;
                int finalArea = area - totalArea;
                System.out.println("The total area you need to paint is: " + finalArea + " m^2");
                float estimatedPaint = (float) finalArea / 12;
                System.out.println("With the estimate of 1 litre of paint covering 12 m^2, you will require: " + estimatedPaint +" litres of paint");



             }   


        
        }

        static int howmanywindows(){
            int numofwindows = 0;
            switch(numofwindows){
                case 1:
                numofwindows = 1;
                break;
    
                case 2:
                numofwindows = 2;
                break;
    
                case 3:
                numofwindows = 3;
                break;
    
                case 4:
                numofwindows = 4;
                break;
            }
    
            return numofwindows;
        }

    




}

