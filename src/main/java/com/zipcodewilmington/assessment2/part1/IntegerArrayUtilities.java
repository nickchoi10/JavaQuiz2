package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length%2==0;
    }

    public Integer[] range(int start, int stop) {

        Integer[] num = new Integer[stop -start +1];
        for(int i =start,index=0; i <=stop; index++,i++)
            num[index] = i;

        return num;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length-1]* array[array.length-2];
    }
}
