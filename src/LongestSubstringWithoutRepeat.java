import java.util.HashSet;

public class LongestSubstringWithoutRepeat {
	
	 public int lengthOfLongestSubstring(String s) {
	        HashSet<Character> long1 = new HashSet<Character>();
	        int longest= 0;
	        for (int i=0; i<s.length(); i++){
	            long1.add(s.charAt(i));
	            longest = (long1.size()>longest ? long1.size(): longest);
	             for (int j=i+1; j<s.length(); j++){
	                 if (long1.contains(s.charAt(j))){
	                     longest = (long1.size()>longest ? long1.size(): longest);
	                	 long1.clear();	 
	                     break;
	                 }
	                 else{
	                	 long1.add(s.charAt(j));
	                     longest = (long1.size()>longest ? long1.size(): longest);
	                 }
	             }
	        }
	        return longest;
	    }

}
