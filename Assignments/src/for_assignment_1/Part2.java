package for_assignment_1;

import java.util.*;

public class Part2 {
 
	//returns true if one string is a permutation of other. false otherwise
	//abc is a permutation of bac
	//but bac is not a permutation of bacc
	public static boolean isStringPermutation(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}//base cases
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(s1 != s2) {
			char temps1[] = s1.toCharArray();
			char temps2[] = s2.toCharArray();
			Arrays.sort(temps1);
			Arrays.sort(temps2);
			String sorted1 = new String(temps1);			
			String sorted2 = new String(temps2);
			if ((sorted1.equals(sorted2)) == false) {
				return false;
			} else {
				return true;
			}//if-else
		}//outer if
		return false;
	}//is permutation
	
	public static void main (String args[]) {
		System.out.println(isStringPermutation("tania","ANIAT"));
	}//main method
}
