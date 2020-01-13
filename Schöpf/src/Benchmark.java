import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.time.Instant;

public class Benchmark {

	public static void main(String[] args) {
		Instant start = Instant.now();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant end = Instant.now();
		Duration between = Duration.between(start, end);
		System.out.println(between.toMillis() +" ms");

	}
}
