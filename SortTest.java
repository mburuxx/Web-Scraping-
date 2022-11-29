public class SortTest {
	
	public static void main(String[] args) {
		Integer[] list = {5,2,4,1,3};
		Sort.sort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}