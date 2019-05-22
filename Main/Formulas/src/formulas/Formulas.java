package formulas;

import java.util.*;

public class Formulas {

    /*
    Since the GUI can only create string type variables as input, either we can
    cast them as double type variables within each method of each equation, or
    in the beginning of the recursive method(before it starts to run each
    equation).
    This will allow the inputs to be of null value since a double 
    can not be null. 
    Also, the output on the GUI will have to be String type variables or else it
    will only give the memory location of each. 
    So before the numbers are output, we will have to cast them back into String
    variables which will also either be done within each method for each equation 
    or as the recursive method outputs the variables.
    
    For this formula example, I casted the inputs from strings(which would be the
    input from the GUI to the program), into double variables using the parse function.
    Then used the formula to calculate the value of acceleration. And lastly, I 
    casted the double value acc back into a string so it could be output by the GUI.
     */
    public static String calcAcceleration(String dV, String t) { //a=∆v/t
        String acceleration;
        if (dV.isEmpty() == true || t.isEmpty() == true) {//checks if there is empty input
            acceleration = "N/A";
        } else {
            double changeInVelocity = Double.parseDouble(dV);//casting input dV as a double value using parse
            double time = Double.parseDouble(t);//casting input t as a double value using parse

            double acc = changeInVelocity / time;//formula

            acceleration = Double.toString(acc);//casting acc from double to string for output
        }

        return acceleration;//returns the string value for acceleration
    }

    public static void main(String[] args) {
        String time, velocity, acceleration;//strings for input to the method

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter change in velocity:");
        velocity = scan.nextLine();//takes input and sets it as the String for velocity

        System.out.println("Enter Time:");
        time = scan.nextLine();//takes input and sets it to the String for time

        acceleration = calcAcceleration(velocity, time);//runs the function with the input Strings

        System.out.println("Acceleration is: " + acceleration);//output
    }

}
