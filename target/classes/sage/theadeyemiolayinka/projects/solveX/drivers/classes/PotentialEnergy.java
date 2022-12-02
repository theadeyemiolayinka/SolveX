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
public class PotentialEnergy extends BaseDriver{
    
    public PotentialEnergy(){
        name = "Potential Energy";
        by = "Ayoola Ibukunoluwa Ayomikun 2022/11335";
        desc = "Potential Energy is the energy a body possesses because of its position." +
                "\n\n" + "Here, m is the mass, g is the value for gravity (default is 10, you can choose to edit) and h is the height.";
        
        data.put("m", null);
        data.put("g", "10");
        data.put("h", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = Double.valueOf(getData("m")) * Double.valueOf(getData("g")) * Double.parseDouble(getData("h"));
            return "Answer: " + String.valueOf(res)+"J";
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
