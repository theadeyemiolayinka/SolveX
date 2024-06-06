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
public class Elasticity extends BaseDriver{
    
    public Elasticity(){
        name = "Elasticity";
        by = "Mechatronics Batch A Team 1 (Thur 11-1)";
        desc = "" +
                "\n\n" + "Here, k is the force constant and e is the extension.";
        
        data.put("k", null);
        data.put("e", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = Double.valueOf(getData("k")) * Double.valueOf(getData("e"));
            return "Answer: " + String.valueOf(res);
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
