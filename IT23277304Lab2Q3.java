public class IT23277304Lab2Q3{
    public static void main(String[] args) {
        double sideA = 3.0;
        double sideB = 4.0;

        double sideASquare= Math.pow(sideA, 2); 
        double sideBSquare = Math.pow(sideB, 2); 

        double hypotenuse = Math.sqrt(sideASquare + sideBSquare);

      
        System.out.println("Length of hypotenuse is: " + hypotenuse);
    }
}
