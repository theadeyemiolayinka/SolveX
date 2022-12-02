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
public class Velocity extends BaseDriver{
    
    public Velocity(){
        name = "Velocity";
        by = "Ojo Olamide Anna 2022/11677";
        desc = "Velocity is the direction of an object or a body. It is the rate of change of displacement. It is measured in m/s. It is a vector quantity. The dimension of velocity is LT^-1" +
                "\n\n" + "Here, V is the final velocity, s; the distance covered, u; the initial velocity, a; the acceleration and t; the time taken" +
                "\n\n" + "To look for the value of the velocity, just enter the values you have and leave the value of others empty when filling the form";
        
        data.put("s", null);
        data.put("u", null);
        data.put("a", null);
        data.put("t", null);
    }
    
    @Override
    @SuppressWarnings("UseSpecificCatch")
    public String eval(){
        try{
            double res = Double.parseDouble(bash());

            return "Answer: " + "V = " + String.valueOf(res) + "m/s";
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }
    
    protected String bash(){
         if (!(getData("s") == null || getData("s").equals(""))){
             if (!(getData("t") == null || getData("t").equals(""))){
                 return method1(Double.parseDouble(getData("s")), Double.parseDouble(getData("t")));
             }else{
                 if (!(getData("a") == null || getData("a").equals(""))){
                    if (!(getData("u") == null || getData("u").equals(""))){
                        return method3(Double.parseDouble(getData("u")), Double.parseDouble(getData("a")), Double.parseDouble(getData("s")));
                    }
                }
             }
         }
         
         if (!(getData("u") == null || getData("u").equals(""))){
           if (!(getData("a") == null || getData("a").equals(""))){
             if (!(getData("t") == null || getData("t").equals(""))){
                 return method2(Double.parseDouble(getData("u")), Double.parseDouble(getData("a")), Double.parseDouble(getData("t")));
             }
            }  
         }
         
         return null;
    }
    
    protected String method1(double s, double t){
        return String.valueOf(s/t);
    }
    
    protected String method2(double u, double a, double t){
        return String.valueOf(u + (a*t));
    }
    
    protected String method3(double u, double a, double s){
        return String.valueOf(Math.sqrt((u * u) + (2 * a *s)));
    }
    

}
