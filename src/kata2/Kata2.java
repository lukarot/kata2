package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        //Integer[] data={1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        String[] data={"Ana","Luis","Ana","Ana","Rosa","Rosa"};
        histogram histo=new histogram(data);
        Map<Integer,Integer> histogr=histo.getHistogram();
        for (int i : histogr.keySet()) {
            System.out.println(i+ "----->"+ histogr.get(i));  
        }
    }
}
