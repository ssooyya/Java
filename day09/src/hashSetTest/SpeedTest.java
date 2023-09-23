package hashSetTest;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class SpeedTest {
	   public static void main(String[] args) {
	      
	      final int SIZE = 50_000_000;
	      final List<Integer> arrayList = new ArrayList<Integer>();
	      final Set<Integer> hashSet = new HashSet<Integer>();
	      final int DATA = 47_133_401;
	      
	      IntStream.range(0, SIZE).forEach(value -> {
	         arrayList.add(value);
	         hashSet.add(value);
	      });
	      
	      Instant start = Instant.now();
	      arrayList.contains(DATA);
	      Instant end = Instant.now();
	      
	      long time = Duration.between(start, end).toMillis();
	      
	      System.out.println("arrayList : " + time * 0.001 + "초");
	      
	       start = Instant.now();
	       hashSet.contains(DATA);
	       end = Instant.now();
	      
	       time = Duration.between(start, end).toMillis();
	      
	      System.out.println("hashSet : " + time * 0.001 + "초");
	   }
}