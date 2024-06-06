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
public class ProjectileMotion2 extends BaseDriver{
    
    public ProjectileMotion2(){
        name = "Max Height in Projectile Motion";
        by = "Mechatronics Batch A Team 1 (Thur 11-1)";
        desc = "A Projectile is an object or body launched into the air and allowed to move on its own or move freely under gravity.examples a shot arrow,a thrown javelin etc.\n" +
                "The maximum height attained is the highest vertical distance attained by the projectile as measured from the horizontal projection plane. " +
                "\n\n" + "Here, u is the initial velocity, θ is the angle of launch and g is the acceleration due to gravity (default 10).";
        
        data.put("u", null);
        data.put("g", null);
        data.put("θ", null);
    }
    
    @Override
    public String eval(){
        try{
            double res;
            res = ((Math.pow(Double.parseDouble(getData("u")), 2)) * ( Math.pow(Math.sin(Double.parseDouble(getData("θ"))), 2))) / (Double.parseDouble(getData("g")) * 2);
            return "Answer: " + String.valueOf(res)+"m";
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
