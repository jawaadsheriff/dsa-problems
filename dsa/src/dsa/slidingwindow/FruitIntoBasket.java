package dsa.slidingwindow;

import java.util.HashMap;

public class FruitIntoBasket {

	public int totalFruits(int[] fruits) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int left = 0, right = 0;
		int maxLen = 0;
		int len = fruits.length;
		while(right < len) {
			if(map.containsKey(fruits[right]) == false) {
				map.put(fruits[right], 1);
			}
			else {
				map.put(fruits[right], map.get(fruits[right]) + 1);
			}
			while(map.size() > 2 && left <= right) {
				map.put(fruits[left], map.get(fruits[left])-1);
				if(map.get(fruits[left]) == 0) {
					map.remove(fruits[left]);
				}
				left++;
			}
			int tempLen = right - left + 1;
			if(maxLen < tempLen) {
				maxLen = tempLen;
			}
			right++;
		}
		return maxLen;
	}
	
	public static void main(String[] args) {
		FruitIntoBasket obj = new FruitIntoBasket();
		int[] fruits = {1,2,3,2,2};
		System.out.println(obj.totalFruits(fruits));
	}
}
