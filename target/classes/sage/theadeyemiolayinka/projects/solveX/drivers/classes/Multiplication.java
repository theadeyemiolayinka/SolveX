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
public class Multiplication extends BaseDriver{
    
    public Multiplication(){
        name = "Multiplication";
        by = "Otitoloju Ephraim 2022/11309";
        desc = "Multiplication is an operation that represents the basic idea of repeated addition of the same number. The numbers that are multiplied are called the factors and the result that is obtained after the multiplication of two or more numbers is known as the product of those numbers. Multiplication is used to simplify the task of repeated addition of the same number." +
                "\n\n" + "Here, x and y are the factors.";
        
        data.put("x", null);
        data.put("y", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = Double.valueOf(getData("x")) * Double.valueOf(getData("y"));
            return "Answer: " + String.valueOf(res);
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
