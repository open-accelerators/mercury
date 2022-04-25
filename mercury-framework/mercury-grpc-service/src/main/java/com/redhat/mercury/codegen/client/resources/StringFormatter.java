package com.redhat.mercury.codegen.client.resources;

public class StringFormatter {
    public static String capitalizeWords(String str){
        String words[]=str.split("\\s");
        String capitalizeWord="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            capitalizeWord+=first.toUpperCase()+afterfirst;
        }
        return capitalizeWord.trim();
    }
}
