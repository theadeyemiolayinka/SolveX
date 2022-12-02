/*

All Rights Reserved. This code is copyright and is part of a package belonging to theadeyemiolayinka

https://github.com/theadeyemiolayinka
 */
package sage.theadeyemiolayinka.projects.solveX.drivers.classes;

import java.util.Arrays;
import sage.theadeyemiolayinka.projects.solveX.drivers.BaseDriver;

/**
 *
 * @author Yinka
 */
public class ArithmeticProgression2 extends BaseDriver{
    
    public ArithmeticProgression2(){
        name = "Sum till the nth term of A.P";
        by = "ADEKOLA OLUWASEGUN VICTOR 2022/11728";
        desc = "Arithmetic progression is a sequence of numbers in which each differs from the preceding one by a constant quantity" +
                "\n\n" + "Here, T(n) is the nth term, a is the first term, l is the last term (optional) and d is the common difference.";
        
        data.put("n", null);
        data.put("l", null);
        data.put("a", null);
        data.put("d", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = 0.0;
            if (!(getData("l") == null || getData("l").equals(""))){
                res = (Double.parseDouble(getData("n")) / 2) * (Double.parseDouble(getData("a")) + Double.parseDouble(getData("l")));
            }else{
                res = (Double.parseDouble(getData("n")) / 2) * ( (Double.parseDouble(getData("a")) * 2) + ((Double.parseDouble(getData("n")) - 1) * Double.parseDouble(getData("d"))));
            }
            
            return "Answer: " + String.valueOf(res);
        }catch(Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
            return ERROR_MSG;
        }
        
    }

}
