package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListUtility {
     ArrayList<Integer> list = new ArrayList<>();


    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {

        return null;
    }

    public String join() {
    String value="";
    for(Integer i: list){
        value +=i +", ";
    }
    return value.substring(0,value.length()-2); //-2 because added ", "
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
