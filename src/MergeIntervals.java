/**
 * @author chenqun
 * Given a collection of intervals, merge all overlapping intervals.
 * For example,Given [1,3],[2,6],[8,10],[15,18],
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MergeIntervals {

	public List<Interval> merge(List<Interval> intervals){
		List<Interval> result = new ArrayList<>();
		Comparator<Interval> order = new Comparator<Interval>(){
			public int compare(Interval a, Interval b){
				if(a.start > b.start)
					return 1;
				else if(a.start == b.start)
					return 0;
				else 
					return -1;
			}
		};
		Collections.sort(intervals, order);
		if(intervals.size()==0){
	        return result;
	    }
		result.add(intervals.get(0));
		for(int i=1;i<intervals.size();i++){
			if(intervals.get(i).start <= result.get(result.size()-1).end){
				result.get(result.size()-1).end=Math.max(intervals.get(i).end,result.get(result.size()-1).end);
			}else 
				result.add(intervals.get(i));
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
class Interval {
  int start;
  int end;
  Interval() { start = 0; end = 0; }
  Interval(int s, int e) { start = s; end = e; }
}
