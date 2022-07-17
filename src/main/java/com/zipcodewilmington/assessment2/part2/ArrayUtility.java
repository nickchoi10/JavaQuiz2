package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] list = new Integer[array1.length + array2.length];
        int index = 0;
        for (Integer i : array1) {
            list[index] = i;
            index++;
        }
        for (Integer i : array2) {
            list[index] = i;
            index++;
        }
        return list;
    }


    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] list = new Integer[array.length];
        int counter = 0;
        for (int i =index;i <array.length ;i++) {
            list[counter] = array[i];
            counter++;
        }
        for (int i =0;i<index;i++) {
            list[counter] = array[i];
            counter++;
        }
        return list;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer[] newArray = merge(array1,array2);
        int count = 0;
        for (Object s : newArray) {
            if (s.equals(valueToEvaluate))
                count++;
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
        int count = 1;
        Object common = new Object[0];

        for (int i = 0; i < array.length; i++) { //iterating through array to set each element to a temp Object
            if (array.length == 1) {
                Object tempObject = array[i];
                return (Integer) tempObject;
            } else {
                int tempCount = 0;
                for (int j = 0; j < array.length; j++) { //while its going through the first iteration, it will check if temp object is == any of the elements again.
                   Object tempObject1= array[i];
                    if (tempObject1 == array[j]) {
                        tempCount++; //inc count by 1 whenever the temp obj == element of orginial obj
                    } else if (tempCount > count) {
                        common = tempObject1;
                    }
                }
            }
        }
        return (Integer) common;
    }
}


