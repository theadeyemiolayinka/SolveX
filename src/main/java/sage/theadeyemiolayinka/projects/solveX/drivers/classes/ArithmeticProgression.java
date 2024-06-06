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
public class ArithmeticProgression extends BaseDriver{
    
    public ArithmeticProgression(){
        name = "nth term of A.P";
        by = "Mechatronics Batch A Team 1 (Thur 11-1)";
        desc = "Arithmetic progression is a sequence of numbers in which each differs from the preceding one by a constant quantity" +
                "\n\n" + "Here, T(n) is the nth term, a is the first term and d is the common difference.";
        
        data.put("n", null);
        data.put("a", null);
        data.put("d", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = Double.parseDouble(getData("a")) + ((Double.parseDouble(getData("n")) - 1) * Double.parseDouble(getData("d")));
            return "Answer: " + String.valueOf(res);
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
