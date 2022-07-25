package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Programa2 {
    public static boolean esAnagrama(String a, String b)
    {
        if (a == null || b == null) {
            return false;
        }
 
        if (a.length() != b.length()) {
            return false;
        }
 
        Map<Character, Integer> freq = new HashMap<>();

        for (char c: a.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
 
        for (char c: b.toCharArray())
        {
            // si `b` no se encuentra en el mapa, es decir, `b` no está presente
            // en la string `b` o tiene más ocurrencias en la string `b`
            if (!freq.containsKey(c)) {
                return false;
            }
 
            // disminuye la frecuencia de `b` en el mapa
            freq.put(c, freq.get(c) - 1);
 
            // si su frecuencia se vuelve 0, lo borra del mapa
            if (freq.get(c) == 0) {
                freq.remove(c);
            }
        }
 
        // devuelve verdadero si el mapa se vacía
        return freq.isEmpty();
    }
 

}
