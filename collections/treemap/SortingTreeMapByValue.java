/******************************************************************************
 *  Compilation:  javac SortingTreeMapByValue.java
 *  Execution:    java SortingTreeMapByValue
 *
 *  Sorting a TreeMap on values by passing a Comparator to that TreeMap.
 *	
 *  % java SortingTreeMapByValue  
 *  [Key4=Tom, Key5=Steve, Key2=Rick, Key3=Kate, Key1=Jack]
 *  
 ******************************************************************************/

import java.util.TreeMap;
import java.util.Map;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Set;
import java.util.Arrays;

class SortingTreeMapByValue {
	public static <K, V extends Comparable<V>> Map<K, V> descendingSortByValues(final Map<K, V> map) {
		// Create a Comparator
		Comparator<K> valueComparator = new Comparator<K> () {
			public int compare(K keyLeft, K keyRight) {
				int result = map.get(keyLeft).compareTo(map.get(keyRight));
				if (result == 0) {
					return result;				
				}

				return -result;
			}
		};

		// Pass a comparator to TreeMap
		TreeMap<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
		
		// Copy the map to a new map which has a specified Comparator.
		sortedByValues.putAll(map);

		return sortedByValues;
	}

	public static void main(String[] args) {
		TreeMap<String, String> treemap = new TreeMap<String, String>();

		treemap.put("Key1", "Jack");
	    treemap.put("Key2", "Rick");
	    treemap.put("Key3", "Kate");
	    treemap.put("Key4", "Tom");
	    treemap.put("Key5", "Steve");

	    // Calling the method sortByvalues
    	Map sortedMap = descendingSortByValues(treemap);

    	Set set = sortedMap.entrySet(); 
	 	System.out.println(Arrays.toString(set.toArray()));
	}
}