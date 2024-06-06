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
public class Subtraction extends BaseDriver{
    
    public Subtraction(){
        name = "Subtraction";
        by = "Mechatronics Batch A Team 1 (Thur 11-1)";
        desc = "Subtraction in mathematics means you are taking something away from a group or number of things. When you subtract, what is left in the group becomes less.\n" +
                "\n" +
                "There are three parts to a subtraction problem. The part you start with is called the minuend. The part being taken away is called the subtrahend. The part that is left after subtraction is called the difference." +
                "\n\n" + "Here, x is the minuend and y is the subtrahend.";
        
        data.put("x", null);
        data.put("y", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = Double.valueOf(getData("x")) - Double.valueOf(getData("y"));
            return "Answer: " + String.valueOf(res);
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
