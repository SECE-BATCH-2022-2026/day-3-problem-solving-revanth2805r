import java.io.*;
import java.util.*;
class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String [] inp = new String[n];
		for(int i=0;i<n;i++){
			inp[i] = br.readLine();
		}
		int index = Integer.parseInt(br.readLine());
		System.out.println(UserMainCode.playString(inp,index));
		br.close();
	}
}
class UserMainCode {
	public static String playString(String[] inp , int index){
		String res = "";
		char c = '\0';
		for(String s:inp){
			try{
				c = s.charAt(index-1);
			} catch (Exception e){
				c = '$';
			}
			res = res+c;
		}
		return res;
	}
}