import java.io.*;
import java.util.*;
class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int count = UserMainCode.countOccurances(s1,s2);
		System.out.println(count);
	}
}

class UserMainCode{
	public static int countOccurances(String s1, String s2){
		// Logics
		//Method 1
		/*int count = 0;
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1 == 0 || l2 == 0){
			return 0;
		}
		int i=0,j=0;
		while(i<l1 && j<l2){
			if(s1.charAt(i)==s2.charAt(j)){
				if(j==l2-1){
					count++;
					j=0;
				}
				i++;
				j++;
				
			} else {
				i++;
				j=0;
			}
		}
		return count;*/
		
		//Method 2
		/*int count = 0;
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1 == 0 || l2 == 0){
			return 0;
		}
		while(s1.contains(s2)){
			count++;
			int i = s1.indexOf(s2);
			s1 = s1.substring(i+l2-1);
		}
		return count;*/
		//Method 3
		int l1=s1.length();
		int l2=s2.length();
		int count=0;
		for(int i=0;i<=l1-l2;i++){
			if(s1.substring(i,i+l2).equals(s2)){
				count++;
			}
		}
		return count;
	}
}