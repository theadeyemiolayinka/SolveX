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
public class FocalLength extends BaseDriver{
    
    public FocalLength(){
        name = "Focal Length";
        by = "Mechatronics Batch A Team 1 (Thur 11-1)";
        desc = "F = Focal Length \n" +
                "U = Distance of the object from the mirror in cm\n" +
                "V = Distance of the image from the mirror in cm";
        
        data.put("U", null);
        data.put("V", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = (1 / ((1 / Double.parseDouble(getData("U"))) + (1 / Double.parseDouble(getData("V")))));
            return "Answer: " + String.valueOf(res)+"cm";
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
