import java.util.*;
class p2 {
	public static void main(String[] args) {
		float result=0;
		Scanner input = new Scanner(System.in);
		try{
			System.out.print("Number1:");
			float num1=input.nextFloat();
			try{
				System.out.print("Number2:");
				float num2=input.nextFloat();
				System.out.print("運算子: 1)+. 2)-. 3)*. 4)/. : ");
				int op=input.nextInt();
				if(op==1){
					result=num1+num2;
					System.out.println("Number1+Number2="+result);
				}
				else if(op==2){
					result=num1-num2;
					System.out.println("Number1-Number2="+result);
				}
				else if(op==3){
					result=num1*num2;
					System.out.println("Number1*Number2="+result);
				}
				else if(op==4){
					if(num2!=0){
						result=num1/num2;
						System.out.println("Number1/Number2="+result);
					}
					else{
						System.out.println("除數為0,錯誤!");
					}
				}
				else{
					System.out.println("Error!");
				}
			}
			catch(Exception e){
				System.out.println("Error!");
			}
		}
		catch(Exception e){
			System.out.println("Error!");
		}
		
	}
}