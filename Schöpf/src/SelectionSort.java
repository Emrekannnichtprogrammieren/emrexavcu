import java.util.ArrayList;

public class SelectionSort {

	
	public static ArrayList<Integer> SelectionSort (ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() -1; j++) {
				int x = list.get(j);
				int y = list.get(j+1);
					list.set(j, y);
					list.set(j+1, x);
			}
			//fehlt
		}
	return list;
}
				
				
				
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(8);
		al.add(4);
		al.add(7);
		al.add(9);
		al.add(12);
		
		ArrayList<Integer> y = SelectionSort(al);
		
		System.out.println(y);

	}

}
