import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.time.Instant;

public class SortTime {

	
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
		Instant start = Instant.now();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add((int) (Math.random()*100));
		al.add((int) (Math.random()*100));
		al.add((int) (Math.random()*100));
		al.add((int) (Math.random()*100));
		al.add((int) (Math.random()*100));
		al.add((int) (Math.random()*100));
		ArrayList<Integer> y = bubbleSort(al);
		Instant end = Instant.now();
		Duration between = Duration.between(start, end);
		System.out.println(between.toMillis() +" ms");
		System.out.println(y);
	}

}
