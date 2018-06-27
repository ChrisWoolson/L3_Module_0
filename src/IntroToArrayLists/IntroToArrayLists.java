package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		// 2. Add five Strings to your list
		strings.add("one");
		strings.add("two");
		strings.add("three");
		strings.add("four");
		strings.add("five");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			System.out.println(s + "standard");
		}
		// 4. Print all the Strings using a for-each loop
		for (String str : strings) {
			System.out.println(str + " for each");
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < strings.size(); i++) {
			if (i % 2 == 0) {
				String s = strings.get(i);
				System.out.println(s + "even");
			}
		}

		// 6. Print all the Strings in reverse order.
		for (int i = strings.size() - 1; i >= 0; i--) {
			String s = strings.get(i);
			System.out.println(s);
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			if (s.indexOf('e') >= 0) {
				System.out.println(s + "       e");
			}

		}
	}
}