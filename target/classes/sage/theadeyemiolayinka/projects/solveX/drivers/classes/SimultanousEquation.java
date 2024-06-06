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
public class SimultanousEquation extends BaseDriver{
    
    public SimultanousEquation(){
        name = "Simultanous Equation 2x2";
        by = "Mechatronics Batch A Team 1 (Thur 11-1)";
        desc = "Simultaneous equations are two or more algebraic equations with the same unknown variables and the same value of the variables satisfies all such equations. This implies that the simultaneous equations have a common solution." +
                "\n\n" +
                "ax + by = c"+
                "\n"+
                "dx + ey = f"+
                "\n\n"+ "Here, we'll use a-f to represent the constants.";
        
        data.put("a", null);
        data.put("b", null);
        data.put("c", null);
        data.put("d", null);
        data.put("e", null);
        data.put("f", null);
    }
    
    @Override
    public String eval(){
        // Using Matrices
        try{
            double det = ((Double.parseDouble(getData("a"))) * (Double.parseDouble(getData("e"))) - (Double.parseDouble(getData("b"))) * (Double.parseDouble(getData("d"))));
            double x = ((Double.parseDouble(getData("c"))) * (Double.parseDouble(getData("e"))) - (Double.parseDouble(getData("b"))) * (Double.parseDouble(getData("f")))) / det;
            double y = ((Double.parseDouble(getData("a"))) * (Double.parseDouble(getData("f"))) - (Double.parseDouble(getData("c"))) * (Double.parseDouble(getData("d")))) / det;
            return "Answer: x = " + String.valueOf(x) + " ; y = " + String.valueOf(y);
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }
}
