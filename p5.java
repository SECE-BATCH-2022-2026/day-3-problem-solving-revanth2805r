import java.io.*;
import java.util.*;
import java.util.stream.*;
class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String [] inp = new String[n];
		for(int i=0;i<n;i++){
			inp[i] = br.readLine();
		}
		String [] op = UserMainCode.removeDuplicates(inp);
		for(String s:op){
			System.out.println(s);
		}
		/*System.out.println("Using Lambda");
		Stream<String> st = Arrays.stream(op);
		st.forEach(System.out::println);
		Arrays.stream(op).forEach(x->System.out.println(x));*/
		br.close();
		
	}
}
class UserMainCode {
	public static String [] removeDuplicates (String [] inp){
		Set<String> ts = new TreeSet<String>();
		for(String s:inp){
			ts.add(s);
		}
		String[] res = new String[ts.size()];
		int i=0;
		for(String s:ts){
			res[i++] = s;
		} 
		//Arrays.sort(inp);
		return res;
	}
}