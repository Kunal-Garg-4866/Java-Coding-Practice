import java.util.Scanner;

public class AreaOfRectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        float lenght = input.nextFloat();
        System.out.println("Enter the breadth of the rectangle:");
        float breadth = input.nextFloat();
    
        float area = lenght * breadth;
        float perimeter = 2 * (lenght + breadth ) ;
        if ( area > perimeter){
            System.out.println("The area of the rectangle is greater than the perimeter.");
        }
        else if(perimeter >area){
            System.out.println("The area of the rectangle is less than the perimeter.");
        }
        else{
            System.out.println("The area of the rectangle is equal to the perimeter.");
        }
    }
}