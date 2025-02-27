package jan2025;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
	
	public static void main(String args[]){
		
		List<Interval> intervals = new ArrayList<>();
		//[[1,2],[3,5],[6,7],[8,10],[12,16]
				
		Interval a = new Interval(1,2);
		Interval b = new Interval(3,5);
		Interval c = new Interval(6,7);
		Interval d = new Interval(8,10);
		Interval e = new Interval(12,16);
		
		intervals.add(a);
		intervals.add(b);
		intervals.add(c);
		intervals.add(d);
		intervals.add(e);
		
		Interval newI = new Interval(4,8);
		insertInterval(intervals, newI);
		
	}

	private static void insertInterval(List<Interval> intervals, Interval newInterval) {
//		List<Interval> result = new ArrayList<>();
//		for(Interval interval : intervals){
//			if(interval.end < newI.start)
//				result.add(interval);
//			else if(interval.start > newI.end){
//				result.add(interval);
//				newI = interval;
//			}else if(interval.end >= newI.start ||
//					interval.start <= newI.end){
//				newI = new Interval(Math.min(interval.start, newI.start),
//						Math.max(interval.end, newI.end));
//			}
				
//		}
		
		List<Interval> result = new ArrayList<>();
        int i = 0;

        // Add all intervals ending before newInterval starts
        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
            result.add(intervals.get(i));
            i++;
        }

        // Merge overlapping intervals
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;
        }
        result.add(newInterval);

        // Add the remaining intervals
        while (i < intervals.size()) {
            result.add(intervals.get(i));
            i++;
        }
		
		
		
		for(Interval i1 : result)
			System.out.println(i1.start + " " + i1.end);
	}

}
