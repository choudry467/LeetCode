
public class SingleNumber_v2 {

	  public int singleNumber(int[] nums) {
	    int a = 0;
	    for (int i : nums) {
	      a ^= i;
	    }
	    return a;
	  }
}