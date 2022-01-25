package Questions;

	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Set;

	public class FindDupEleInArray {

		public static void main(String[] args) {
			String[] arg = { "A", "B", "C", "D", "E", "B", "D" };
			for (int i = 0; i < arg.length; i++) {
				for (int j = i + 1; j < arg.length; j++)
					if (arg[i].equals(arg[j])) {

						System.out.print(arg[j] + " ");// B D
					}

			}

		}
	}
//			// Second solution : use HashSet data structure to find duplicates 
//			System.out.println("Duplicate elements from array using HashSet data structure"); 
//			String[] names = { "A", "B", "C", "D", "E", "B", "D" };
//			Set<String> store = new HashSet<>();
//			for (String name : names) { 
//				if (store.add(name) == false) { 
//					System.out.println("found a duplicate element in array : " + name); } }
//				}
//			}

//			// Third solution : using Hash table data structure to find duplicates
//			System.out.println("Duplicate elements from array using hash table");
//			String[] names = { "A", "B", "C", "D", "E", "B", "D" };
//			Map<String, Integer> nameAndCount = new HashMap<>();
//			// build hash table with count
//			for (String name : names) {
//				Integer count = nameAndCount.get(name);
//				if (count == null) {
//					nameAndCount.put(name, 1);
//				} else {
//					nameAndCount.put(name, ++count);
//				}
//			}
//			// Print duplicate elements from array in Java
//			Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet();
//			for (Entry<String, Integer> entry : entrySet) {
//				if (entry.getValue() > 1) {
//					System.out.println("Duplicate element from array : " + entry.getKey());
////					Duplicate elements from array using hash table
////					Duplicate element from array : B
////					Duplicate element from array : D
//				}
//			}
//		}
	//}

//			int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 };
	//
//			for (int i = 0; i < my_array.length - 1; i++) {
//				for (int j = i + 1; j < my_array.length; j++) {
//					if ((my_array[i] == my_array[j]) && (i != j)) {
//						System.out.println("Duplicate Element : " + my_array[j]);
//					}
//				}
//			}
//		}
	//}

