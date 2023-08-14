package Arrays;
import java.util.*;
public class Hashmap {
public static void main(String[] args) {
	//country(key),Population(valu)
	HashMap<String,Integer> map=new HashMap<>();
	//Insertion
	map.put("India", 150);
	map.put("China", 140);
	map.put("US", 30);
	System.out.println(map);
	map.put("China", 200);
	System.out.println(map); //yaha pe dekho update hogay hota valu 
	//Search
	if(map.containsKey("India")) {//ye dekhne ke liye hota hai ki key hai ya nhi
		System.out.println("key is present in the map");
	}
	else System.out.println("not Present in map");
	System.out.println(map.get("US"));//ye valu deta hai 
	for(Map.Entry<String,Integer> e:map.entrySet()) {
		System.out.println(e.getKey());
		System.out.println(e.getValue());
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
