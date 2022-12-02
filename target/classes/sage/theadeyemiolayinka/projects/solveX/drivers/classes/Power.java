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
public class Power extends BaseDriver{
    
    public Power(){
        name = "Power";
        by = "Ayoola Ibukunoluwa Ayomikun 2022/11335";
        desc = "Power is defined as the rate of doing work." +
                "\n\n" + "Here, W is the workdone and t is the time taken.";
        
        data.put("", null);
        data.put("t", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = Double.valueOf(getData("W")) / Double.valueOf(getData("t"));
            return "Answer: " + String.valueOf(res)+"W";
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
