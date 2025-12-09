import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		int ans = UserMainCode.calculateSum(num1,num2,num3);
		System.out.println(ans);
		sc.close();
	}
}

class UserMainCode {
	public static Integer calculateSum (Integer num1,Integer num2,Integer num3){
		//Logic		
		if(num1 == 13){
			if(num3 == 13){
				return 0;
			} else {
				return num3;	
			}
			
		} else if(num2 == 13){
			return num1;
		} else if(num3 == 13){
			return num1+num2;
		} else {
			return num1+num2+num3;
		}
	}
}