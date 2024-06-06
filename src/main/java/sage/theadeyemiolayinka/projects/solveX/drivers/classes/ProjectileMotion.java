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
public class ProjectileMotion extends BaseDriver{
    
    public ProjectileMotion(){
        name = "Time of Flight in Projectile Motion";
        by = "Mechatronics Batch A Team 1 (Thur 11-1)";
        desc = "A Projectile is an object or body launched into the air and allowed to move on its own or move freely under gravity.examples a shot arrow,a thrown javelin etc.\n" +
                "Time of flight is the time required for a projectile to return tothe same level from which it was projected." +
                "\n\n" + "Here, u is the initial velocity, θ is the angle of launch and g is the acceleration due to gravity (default 10).";
        
        data.put("u", null);
        data.put("g", null);
        data.put("θ", null);
    }
    
    @Override
    public String eval(){
        try{
            double res;
            res = ((2 * Double.parseDouble(getData("u"))) * ( Math.sin(Double.parseDouble(getData("θ"))))) / Double.parseDouble(getData("g"));
            return "Answer: " + String.valueOf(res)+"s";
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
