package Notes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		// List
		* 
		* Allows duplicates
		* Allows null
		* Common implementation: ArrayList, LinkedList, Vector
		*/
		List<String> students = new ArrayList<String>();
		students.add("Rob");
		students.add("Rob");
		students.add("Sam");
		
		for (String student : students) {
			System.out.println(student);
		}
		System.out.println(students.get(2));
		System.out.println(students.get(0));
		System.out.println("");
		
		/* 
		 * 		*Set  
		 * Sets do not allow duplicates
		 * Sets are unordered
		 * does allow null
		 * Common implementation: HashSet, LinkedHashSet, TreeSet
		
		*/
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Kansas");
		states.add("Nebraska");
		states.add("Alabama");
		states.add(null); // you do not have to establish any info with null
		
		for (String state : states) {
			System.out.println(state);
		}
		System.out.println(states.contains("Missouri"));
		System.out.println();
		
		//map
		
		/*Map(key,Value) ex - Map dictionary(word,definition);
		 * 
		 * Key value pairs (like a dictionary)
		 * Values can be duplicates but keys can not be
		 * Common Implementations: HashMap, LinkedHashMap, TreeMap
		 */
		
		Map<Integer, String> peoplePlacements = new HashMap<Integer, String>();
		peoplePlacements.put(1, "Jerry");
		peoplePlacements.put(2, "Jake");
		peoplePlacements.put(3, "Caleb");
		
		System.out.println(peoplePlacements.get(2));
		
		/*
		 * to remove - peoplePlacements.remove(1) will remove "1, Jerry"
		 * to add - peoplePlacements.append()
		 */
		
		// to get both Keys and values to print  
		
		Set<Integer> peopleKeys = peoplePlacements.keySet();
		for (Integer key: peopleKeys) {
			System.out.println(key + ": " + peoplePlacements.get(key));
		}
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Irrespective", "Not taking (something) into account; regardless of.");
		dictionary.put("Variable", "Not taking (something) into account; regardless of.");
		dictionary.put("Property", "The action of putting someone or something in a particular place or the fact of being placed.");
		
		
	}
}
