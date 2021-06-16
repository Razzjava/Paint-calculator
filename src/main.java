import java.util.Scanner;

public class Main {
private static Scanner scan = new Scanner(System.in);
    // create an array based on the walls and a collection of windows for each walls

    public static void main(String[] args) {

        /*
         * String thanks = "Thank you, "; String name = "miguel!"; String order =
         * "Your order number is #"; int previousOrder = 715; System.out.println(thanks
         * + name.toUpperCase()); System.out.println(order + (previousOrder+1));
         */

        // Scanner wall = new Scanner(System.in);

        // calling and saving number of walls function;
        int[] areaofwalls = numberofwalls();

        int totalareaWalls = 0;

        for (int currentarea : areaofwalls) {
            System.out.println(currentarea);
            totalareaWalls += currentarea;
        }

        

        System.out.println("Do you have any windows? (true/false):");
        boolean windows = scan.nextBoolean();

        if (!windows) {

            System.out.println(
                    "The total area of your wall is: " + totalareaWalls + " m^2 " + " for  " + (areaofwalls.length) + " walls");
            float estimatedPaint = (float) totalareaWalls / 12;
            System.out.println("With the estimate of 1 litre of paint covering 12 m^2, you will require: "
                    + estimatedPaint + " litres of paint");
        } else {

            int windowsArea = howmanywindows();
            int finalArea = totalareaWalls - windowsArea;
            System.out.println("The total area you need to paint is: " + finalArea + " m^2");
            float estimatedPaint = (float) finalArea / 12;
            System.out.println("With the estimate of 1 litre of paint covering 12 m^2, you will require: " + estimatedPaint + " litres of paint ");

        }
        

    }

    static int[] numberofwalls(){
        // Scanner input = new Scanner(System.in);

        System.out.println("Enter number of walls: ");
        int numofwalls = scan.nextInt();

        // initializing an array for storing wall data
        int[][] walls = new int[numofwalls][2];

        for (int i = 0; i < numofwalls; i++) {
            System.out.println("enter height in meters: ");
            int wallheight = scan.nextInt();
            walls[i][0] = wallheight;

            System.out.println("Enter width in meters: ");
            int wallwidth = scan.nextInt();

            walls[i][1] = wallwidth;

        }

        // calculating area of each wall
        int[] areas = calculateArea(walls);

        

        return areas;
    }

    static int[] calculateArea(int[][] walls){
        int[] areas = new int[walls.length];
        for (int i = 0; i < walls.length; i++) {
            areas[i] = walls[i][0] * walls[i][1];
        }

        return areas;
    } 

    static int howmanywindows() {
        System.out.println("How many windows do you have?: ");

        int numofwindows = scan.nextInt();

        int total = 0;
        
        for (int i=0; i<numofwindows; i++){
            System.out.println("what height are your windows (m)?: ");
            int heightofWindows = scan.nextInt();
            System.out.println("what width are your windows (m)?: ");
            int widthofWindows = scan.nextInt();
            total += (heightofWindows * widthofWindows);
        }

        int totalArea = total * numofwindows;

        return totalArea;


}

}
