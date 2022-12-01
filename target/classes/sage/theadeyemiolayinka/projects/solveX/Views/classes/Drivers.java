/*

All Rights Reserved. This code is copyright and is part of a package belonging to theadeyemiolayinka

https://github.com/theadeyemiolayinka
 */
package sage.theadeyemiolayinka.projects.solveX.Views.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import sage.theadeyemiolayinka.projects.solveX.drivers.BaseDriver;

/**
 *
 * @author Yinka
 */
public class Drivers {
    
    static String PACKAGE_NAME = "sage.theadeyemiolayinka.projects.solveX.drivers.classes";
    
    public static Set<Class> getClasses(String packageName) {
        
        Reflections reflections = new Reflections(packageName, new SubTypesScanner(false));
        return reflections.getSubTypesOf(BaseDriver.class)
          .stream()
          .collect(Collectors.toSet());
    }
    
    public static HashMap<String,Class> getAll() throws NoSuchMethodException, InstantiationException, IllegalAccessException{
        HashMap<String,Class> res = new HashMap();
        Set<Class> classes = Drivers.getClasses(PACKAGE_NAME);
        
        for (Class value : classes) {
           BaseDriver driver = (BaseDriver) value.newInstance();
           res.put( driver.getName() , value); 
        }
        
        return res;
    }
    
    public static void main(String [] args){
        
    }
}
