package ibm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Compression {
    public static String properCompression(String str){
        Map<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<str.length();i+=2){
            char c=str.charAt(i);
            int count=Character.getNumericValue(str.charAt(i+1));

            map.put(c,map.getOrDefault(c,0)+count);
        }
        StringBuilder result=new StringBuilder();
        for(Map.Entry<Character,Integer>entry: map.entrySet()){
            result.append(entry.getKey());
            result.append(entry.getValue());
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to find the proper compression first alphabet then letter occurrence");
        String str=sc.next();
        String result=properCompression(str);
        System.out.println("The proper compression is "+result);
    }
}
