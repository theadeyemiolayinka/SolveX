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
public class MagneticFluxDensity extends BaseDriver{
    
    public MagneticFluxDensity(){
        name = "Magnetic Flux Density";
        by = "Mechatronics Batch A Team 1 (Thur 11-1)";
        desc = "Magnetic flux density in physics is the force acting per unit current per unit length on a wire placed at right angles to the magnetic field. It’s S.I unit is Tesla (T). " +
                "\n\n" + "Here, ∅ is the Magnetic Flux and A is the cross sectional area.";
        
        data.put("A", null);
        data.put("∅", null);
    }
    
    @Override
    public String eval(){
        try{
            double res = Double.parseDouble(getData("∅")) / Double.parseDouble(getData("A"));
            return "Answer: " + "ß = " + String.valueOf(res) + "m³/s";
        }catch(Exception e){
            return ERROR_MSG;
        }
        
    }

}
