/*This program calculates the area of a circle,
reading the radius and printing the area.*/

import java.util.Scanner;

public class areaCirculo {

    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        double radio, area;
        System.out.println("Enter the radius");
        radio = leer.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("The area is: "+area);

    }
}
