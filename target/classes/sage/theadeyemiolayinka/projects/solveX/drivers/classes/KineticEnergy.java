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
public class KineticEnergy extends BaseDriver{
    
    public KineticEnergy(){
        name = "Kinetic Energy";
        by = "Ayoola Ibukunoluwa Ayomikun 2022/11335";
        desc = "Kinetic Energy is the energy a body possesses because of its motion." +
                "\n\n" + "Here, m is the mass and v is the velocity.";
        
        data.put("m", null);
        data.put("v", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = Double.valueOf(getData("m")) * Double.valueOf(getData("v")) * Double.parseDouble(getData("v")) * 0.5;
            return "Answer: " + String.valueOf(res)+"J";
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
