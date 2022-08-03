package com.fun.misc;


import java.util.ArrayList;
import java.util.List;

public class DeDupLists {

    public static void main(String[] args) {
        var list1 = new ArrayList<String>();
        var list2 = new ArrayList<String>();

        list1.add("Hello");
        list1.add("Bye");
        list1.add("Greetings");
        list1.add("Sup");
        list1.add("Yoooo");

        list2.add("Hello");
        list2.add("Nah");
        list2.add("Ummm");
        list2.add("Hey");
        list2.add("Shenanigans");

        var list = returnUniqueElements(list1, list2);

        if (!list.isEmpty()) list.forEach(item -> System.out.println(item));
    }

    protected static List<String> returnUniqueElements(List<String> list1, List<String> list2) {
        var list = new ArrayList<String>();

        //If list sizes do not match, return an empty list
        if (list1.size() != list2.size()) return list;

        //Iterate through list 1, only adding unique elements
        for (int i=0; i<list1.size(); i++) {
            if (!list1.get(i).equalsIgnoreCase(list2.get(i))) {
                list.add(list1.get(i));
            }
        }

        //Iterate through list 2, only adding unique elements
        for (int j=0; j<list2.size(); j++) {
            if (!list2.get(j).equalsIgnoreCase(list1.get(j))) {
                list.add(list2.get(j));
            }
        }

        return list;
    }
}
