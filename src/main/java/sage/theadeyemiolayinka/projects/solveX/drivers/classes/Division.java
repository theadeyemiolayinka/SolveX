/*

All Rights Reserved. This code is copyright and is part of a package belonging to theadeyemiolayinka

https://github.com/theadeyemiolayinka
 */
package sage.theadeyemiolayinka.projects.solveX.drivers.classes;

import sage.theadeyemiolayinka.projects.solveX.drivers.BaseDriver;

/**
 *
 * @author Yinka
 */
public class Division extends BaseDriver{
    
    public Division(){
        name = "Division";
        by = "Mechatronics Batch A Team 1 (Thur 11-1)";
        desc = "The division is the process of repetitive subtraction. It is the inverse of the multiplication operation. It is defined as the act of forming equal groups. While dividing numbers, we break down a larger number into smaller numbers such that the multiplication of those smaller numbers will be equal to the larger number taken." +
                "\n\n" + "Here, x and y are the numbers.";
        
        data.put("x", null);
        data.put("y", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = Double.valueOf(getData("x")) / Double.valueOf(getData("y"));
            return "Answer: " + String.valueOf(res);
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
