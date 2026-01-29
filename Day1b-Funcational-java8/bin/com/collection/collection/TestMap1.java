package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        // Retrieve all keys
        Set<Integer> keys = map.keySet();
        System.out.println("Keys: " + keys);

        // Iterate keys to get values
        for (Integer key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        

        // Retrieve all values
        Collection<String> values = map.values();
        System.out.println("Values: " + values);
        
        
     // Retrieve key-value pairs
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
	}

}
