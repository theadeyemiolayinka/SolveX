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
public class Addition extends BaseDriver{
    
    public Addition(){
        name = "Addition";
        by = "Mechatronics Batch A Team 1 (Thur 11-1)";
        desc = "Addition in math is a process of combining two or more numbers. Addends are the numbers added, and the result or the final answer we get after the process is called the sum. It is one of the essential mathematical functions we use in our everyday activities." +
                "\n\n" + "Here, x and y are the addends.";
        
        data.put("x", null);
        data.put("y", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = Double.valueOf(getData("x")) + Double.valueOf(getData("y"));
            return "Answer: " + String.valueOf(res);
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
