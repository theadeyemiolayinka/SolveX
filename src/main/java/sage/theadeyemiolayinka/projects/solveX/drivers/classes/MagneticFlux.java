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
public class MagneticFlux extends BaseDriver{
    
    public MagneticFlux(){
        name = "Magnetic Flux";
        by = "Nwankwere Destiny Chinonyerem 2022/11738";
        desc = "The number of magnetic lines passing through area A is known as Magnetic flux." +
                "\n\n" + "Φb = magnetic flux\n" +
                "B = Magnetic field\n" +
                "A = area\n" +
                "θ = angle between B and A";
        
        data.put("B", null);
        data.put("A", null);
        data.put("θ", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = Double.valueOf(getData("B")) * Double.valueOf(getData("A")) * Math.cos(Double.valueOf(getData("θ")));
            return "Answer: " + String.valueOf(res);
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
