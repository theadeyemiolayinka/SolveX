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
public class Work extends BaseDriver{
    
    public Work(){
        name = "Work";
        by = "Mechatronics Batch A Team 1 (Thur 11-1)";
        desc = "Work is said to be done whenever a force moves a body through a certain distance in the direction of a force." +
                "\n\n" + "Here, F is the force and d is the distance.";
        
        data.put("F", null);
        data.put("d", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = Double.valueOf(getData("F")) * Double.valueOf(getData("d"));
            return "Answer: " + String.valueOf(res)+"J";
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
