package SettoMap;

import java.util.Map;
import java.util.TreeMap;

public class IntSet {

    private Map<Integer, Object> map = new TreeMap<>();

    public void add (int value){

        map.put(value,null);

    }

    public void clear(){
        map.clear();
    }

    public boolean constains(int value){
        return map.containsKey(value);
    }




}
