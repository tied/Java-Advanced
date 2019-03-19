package edu.ap.rubenM;

import java.util.ArrayList;


public class Main{
    public static void main(String[] args) {
       /*
        String[] keys = {"een", "twee", "drie"};
        String[] values = {"one", "two", "three"};
        KeyValues<String, String> pair = new KeyValues<String, String>(keys, values);

        System.out.println(pair.get("drie"));
*/

        ArrayList<Integer> keynr = new ArrayList<>();
        keynr.add(1);
        keynr.add(2);
        keynr.add(3);
        keynr.add(4);
        ArrayList<String> valuestr = new ArrayList<>();
        valuestr.add("een");
        valuestr.add("twee");
        valuestr.add("drie");
        valuestr.add("vier");
        KeyValues<Integer, String> alfabet = new KeyValues<Integer, String>(keynr, valuestr);

        System.out.println(alfabet.get(4));

    }
}