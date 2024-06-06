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
public class Speed extends BaseDriver{
    
    public Speed(){
        name = "Average Speed";
        by = "Mechatronics Batch A Team 1 (Thur 11-1)";
        desc = "This is the average of speed of a moving body for the overall distance that it has covered " +
                "\n\n" + "Here, s is the distance t is the time taken.";
        
        data.put("s", null);
        data.put("t", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = Double.valueOf(getData("s")) / Double.valueOf(getData("t"));
            return "Answer: " + String.valueOf(res);
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
