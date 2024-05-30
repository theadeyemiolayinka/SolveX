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
public class ProjectileMotion3 extends BaseDriver{
    
    public ProjectileMotion3(){
        name = "Range in Projectile Motion";
        by = "OSAMOR EBUBE 2022/11123";
        desc = "A Projectile is an object or body launched into the air and allowed to move on its own or move freely under gravity.examples a shot arrow,a thrown javelin etc.\n" +
                "The range is defined as the horizontaldistance from the point of projection to the point where the projectile hits the projection plane again." +
                "\n\n" + "Here, u is the initial velocity, θ is the angle of launch and g is the acceleration due to gravity (default 10).";
        
        data.put("u", null);
        data.put("g", null);
        data.put("θ", "10");
    }
    
    @Override
    public String eval(){
        try{
            double res;
            res = ((Double.parseDouble(getData("u")) * Double.parseDouble(getData("u"))) * ( Math.sin(2 * Double.parseDouble(getData("θ"))))) / Double.parseDouble(getData("g"));
            return "Answer: " + String.valueOf(res)+"m";
        }catch(Exception e){
            return ERROR_MSG;
        }
    }

}
