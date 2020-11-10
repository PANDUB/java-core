package com.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Pattern;

public class StringRegex {


    public static void main(String[] args) {

        String data = "0000100";
        StringBuilder builder = new StringBuilder(data);
        int x = 1;
        builder.insert(builder.length() - x, ".");
        List l1 = new ArrayList<>();
        l1.add("1");

        HashMap<String,String> h = new HashMap();
        h.put("1","2");

        Runnable t = new Thread();

        t.run();

        System.out.println(builder.toString());
    }
}
