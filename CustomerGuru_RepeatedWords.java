import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CustomerGuru_RepeatedWords {

	private static List<String> mostRepeatingWord(String list) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String str : list.split(",")) {
			if (!map.containsKey(str))
				map.put(str, 1);
			else
				map.put(str, map.get(str) + 1);
		}

		int max = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet())
			max = Math.max(max, entry.getValue());

		ArrayList<String>[] arr = (ArrayList<String>[]) new ArrayList[max + 1];
		for (int i = 1; i <= max; i++)
			arr[i] = new ArrayList<String>();

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			int count = entry.getValue();
			String element = entry.getKey();
			arr[count].add(element);
		}

		ArrayList<String> result = new ArrayList<String>();
		for (int j = max; j >= 1; j--) {
			if (arr[j].size() > 0) {
				for (String a : arr[j]) {
					result.add(a);
					if (result.size() == 5)
						break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String input= "AAA,AAA,BBB,BBB,BBB,CC,CC,XXX,XXX,PP,QQ,XXX,XXX";
		System.out.println(mostRepeatingWord(input));
	}
}