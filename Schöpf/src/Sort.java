import java.util.ArrayList;

public class Sort {

	
	public static ArrayList<Integer> bubbleSort (ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() -1; j++) {
				int x = list.get(j);
				int y = list.get(j+1);
				if (x>y) {
					list.set(j, y);
					list.set(j+1, x);
				}
			}
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(8);
		al.add(4);
		al.add(7);
		al.add(9);
		al.add(3);
		al.add(5);
		
		ArrayList<Integer> y = bubbleSort(al);
		
		System.out.println(y);
	}

}
