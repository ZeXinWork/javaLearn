package com.imooc.collection.set;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSample {

      class  IntegerCompare implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    }
    public IntegerCompare getClassCompare(){
        return new IntegerCompare();
    }

    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>(new TreeSetSample().getClassCompare());
        integerTreeSet.add(1);
        integerTreeSet.add(2);
        integerTreeSet.add(3);
        System.out.println(integerTreeSet);
    }
}
