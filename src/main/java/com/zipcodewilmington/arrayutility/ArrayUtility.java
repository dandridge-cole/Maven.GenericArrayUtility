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
        E[] newArray = mergeArrays(arrayToMerge);
        return countDuplicates(valueToEvaluate, newArray);
    }

    private Integer countDuplicates(E valueToEvaluate, E[] newArray) {
        Integer counter=0;
        for(E element:newArray) if(element.equals(valueToEvaluate)) counter++;
        return counter;
    }

    public E getMostCommonFromMerge(E[] arrayToMerge){
        Integer max=0;
        E value=null;
        E[] newArray = mergeArrays(arrayToMerge);
        for(E element:newArray) {
            Integer thisCount=countDuplicates(element,newArray);
            if(thisCount>max){
                max=thisCount;
                value=element;
            }
        }
        return value;
    }

    public Integer getNumberOfOccurrences(E valueToEvaluate){
        return countDuplicates(valueToEvaluate,this.array);
    }

    public E[] removeValue(E valueToRemove){
        Integer countRemove = getNumberOfOccurrences(valueToRemove);
        Integer counter=0;
        E[] newArray = Arrays.copyOf(this.array,this.array.length-countRemove);
        for(E element:this.array)if(!element.equals(valueToRemove))newArray[counter++]=element;
        return newArray;
    }

    private E[] mergeArrays(E[] arrayToMerge){
        E[] newArray = Arrays.copyOf(this.array,this.array.length+arrayToMerge.length);
        for(int i =0;i<arrayToMerge.length;i++) newArray[i+this.array.length]=arrayToMerge[i];
//        List<E> al = Arrays.asList(this.array);
//        al.addAll(Arrays.asList(arrayToMerge));
//        E[] newArray = Arrays.copyOf(this.array,al.size()+arrayToMerge.length);
//        al.toArray(newArray);
        return newArray;
    }
}
