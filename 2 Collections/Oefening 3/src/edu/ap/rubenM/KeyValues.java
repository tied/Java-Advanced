package edu.ap.rubenM;

import java.util.ArrayList;

public class KeyValues<K extends Number, V>{
    ArrayList<K> keys;
    ArrayList<V> values;


    public KeyValues() {
    }

    public KeyValues(ArrayList<K> keys, ArrayList<V> values) {
        this.keys = keys;
        this.values = values;
    }
    
    public V get(K key){
        int index = keys.indexOf(key);
        return values.get(index);
    }

}