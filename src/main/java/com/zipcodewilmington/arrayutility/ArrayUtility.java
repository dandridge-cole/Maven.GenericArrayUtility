package com.zipcodewilmington.arrayutility;

import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<E> {
    E[] array;

    public ArrayUtility(E[] array) {
        this.array = array;
    }

    public Integer countDuplicatesInMerge(E[] arrayToMerge, E valueToEvaluate){
        return -1;
    }

    public E getMostCommonFromMerge(E[] arrayToMerge){
        return null;
    }

    public Integer getNumberOfOccurrences(E valueToEvaluate){
        return -1;
    }

    public E[] removeValue(E valueToRemove){
        return array;
    }

    private E[] mergeArrays(E[] arrayToMerge){
            List<E> al = Arrays.asList(this.array);
            al.addAll(Arrays.asList(arrayToMerge));
            E[] newArray = arrayToMerge.clone();
                    al.toArray(newArray);
        return newArray;
    }
}
