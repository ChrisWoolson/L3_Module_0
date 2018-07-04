package BubbleSort;

import java.util.ArrayList;

public class MergeSort {

	public static void main(String[] args) {
		ArrayList<Integer> ints1 = new ArrayList<Integer>();
		ArrayList<Integer> ints2 = new ArrayList<Integer>();
		ints1.add(5);
		ints1.add(3);
		ints1.add(1);
		ints1.add(2);
		ints1.add(4);
		ints2.add(2);
		MergeSort bs = new MergeSort();
		bs.sort(ints1);

	}

	public void print(ArrayList<Integer> list) {
		System.out.print("Size: " + list.size() + " [");
		for (int i : list)
			System.out.print(i + " ");
		System.out.println("]");
	}

	public ArrayList<Integer> sort(ArrayList<Integer> ints1) {
		System.out.println("Enter Sort: ");
		print(ints1);
		if (ints1.size() <= 1) {
			return ints1;
		}
		ArrayList<ArrayList<Integer>> splits = split(ints1);
		ArrayList<Integer> left = sort(splits.get(0));
		ArrayList<Integer> right = sort(splits.get(1));
		return merge(left, right);

	}

	private ArrayList<ArrayList<Integer>> split(ArrayList<Integer> ints1) {
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();

		for (int i = 0; i < ints1.size(); i++) {

			if (i % 2 == 0) {
				right.add(ints1.get(i));
			} else {
				left.add(ints1.get(i));
			}
		}

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result.add(left);
		result.add(right);
		return result;
	}

	public ArrayList<Integer> merge(ArrayList<Integer> ints1, ArrayList<Integer> ints2) {

		ArrayList<Integer> merged = new ArrayList<Integer>();
		int i1 = 0, i2 = 0;

		while (merged.size() < ints1.size() + ints2.size()) {
			if (i1 >= ints1.size()) {
				merged.add(ints2.get(i2));
				i1++;
			} else if (i2 >= ints2.size()) {
				merged.add(ints1.get(i1));
				i2++;
			} else if (ints1.get(i1) > ints2.get(i2)) {
				merged.add(ints2.get(i2));
				i2++;
			} else {
				merged.add(ints1.get(i1));
				i1++;
			}

		}

		return merged;

	}

}