package kata2.pkg2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final Integer data[];

    public Histogram(Integer data[]) {
        this.data = data;
    }
    
    public Map<Integer, Integer> getHistogram() {
        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for(Integer i : data) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1 : 1);            
        }
        
        return histogram;
    }
    
    public Integer[] getHistograma() {
        return data;
    }
}