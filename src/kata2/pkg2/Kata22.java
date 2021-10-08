package kata2.pkg2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata22 {

    public static void main(String[] args) {
        Integer data[] = {1,2,3,3,1,6,7,0,3,10,11,10,13,5,1};
        Histogram histo = new Histogram(data);        
        Map<Integer, Integer> histogr = histo.getHistogram();        
        
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));                    
        }
        
        /*
        // Método 1
        for (Map.Entry<Integer, Integer> value : histogram.entrySet()) {
            System.out.println("La clave " + value.getKey()+ " y el valor " + value.getValue());                    
        }
        
        // Método 2
        for (Integer key : histogram.keySet()) {
            System.out.println("La clave " + key);                    
        }
        
        for (Integer value : histogram.values()) {
            System.out.println("El valor " + value);                    
        }
        
        // Método 3
        Iterator<Map.Entry<Integer, Integer>> iterator = histogram.entrySet().iterator();
        
        while(iterator.hasNext()) {
            Map.Entry<Integer, Integer> set = iterator.next();
            System.out.println("La clave " + set.getKey() + " y el valor " + set.getValue());
        }
        
        // Método 4
        iterator = histogram.entrySet().iterator();
        
        while(iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = (HashMap.Entry) iterator.next();
            Integer key = (Integer) entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println("La clave " + key + " y el valor " + value);
        }
        */
    }
    
}
