/*

All Rights Reserved. This code is copyright and is part of a package belonging to theadeyemiolayinka

https://github.com/theadeyemiolayinka
 */
package sage.theadeyemiolayinka.projects.solveX.drivers;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Yinka
 */
public class BaseDriver{
    protected String name = "SolveX";
    
    protected String by = "Sage 2022/11512";
    
    protected String desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sed suscipit sapien. Quisque gravida libero et ullamcorper maximus. Mauris mattis arcu nec commodo semper. Mauris ut metus in diam viverra efficitur a id odio. Sed ex tortor, feugiat at nunc interdum, ullamcorper iaculis ligula. Sed sapien mi, ultricies id turpis id, feugiat viverra ligula. Nulla quis molestie purus. Aenean quis augue nunc. Donec viverra nibh elit, sed bibendum ipsum scelerisque et. Pellentesque tristique, tellus vitae pretium sagittis, leo ex tristique ex, sed mattis metus nunc at magna.\n" +
                         "\n" +
                         "Curabitur ornare vitae leo quis rhoncus. Phasellus efficitur efficitur tincidunt. Donec condimentum, risus ut ornare consectetur, velit mauris rhoncus sapien, vel imperdiet nisl ex id leo. Mauris ut euismod sem. Nulla ac sodales neque, a consequat nulla. Sed convallis magna ac est fermentum, sit amet efficitur libero sollicitudin. Sed quis leo blandit, facilisis lacus nec, tristique leo. Quisque egestas fermentum orci, sit amet pretium eros tempor eget. Nunc pharetra, velit a feugiat luctus, ante sapien varius dui, eget luctus sapien nisi at purus.";
    
    protected final String ERROR_MSG = "We encountered an error evaluating your request";

    protected HashMap<String, String> data = new HashMap();
        
    
    
    
    
    
    
    public String getName() {
        return this.name;
    }
    
    public String getBy() {
        return this.by;
    }
    
    public String getDesc() {
        return this.desc;
    }
    
    public String getData(String ref){
        return this.data.get(ref);
    }
    
    public void setData(String key, String value){
        this.data.put(key, value);
    }
    
    public Set<String> getReqs(){
        return this.data.keySet();
    }
    
    public void setReqs(HashMap<String, String> seed){
        this.data = seed;
    }
    
    public String eval(){
        return "";
    }
}
