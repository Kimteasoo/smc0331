import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		
		System.out.print("10개의 랜덤 숫자 중 하나 맞춰(1~50까지):");
		Scanner sc=new Scanner(System.in); //스캐너생성
		int num =sc.nextInt(); 
		int diff = 0;
		int[]arr = new int[10];
		
		for (int a=0; a<10; a++){
			arr[a]=(int)(Math.random()*50+1);
			System.out.print(arr[a]+" ");
		}
		System.out.println();	
			
			
			
			for(int i=0; i<10; i++){
			if(arr[i] == num){
				System.out.println("당첨!");
			diff=1;
			
				
			}
		}  
	if(diff==0) System.out.println("꽝");
	}

}
