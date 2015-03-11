import java.util.*;
class p4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] name=new String[3];
		int[] grade={-1,-1,-1};
		for(int i=0;i<3;i++){
			System.out.print("學生"+(i+1)+"姓名:");
			name[i]=new String(input.next());
			while(true){
				try{
					System.out.print("學生"+(i+1)+"成績:");
					grade[i]=input.nextInt();
					if(grade[i]<0 || grade[i]>100){
						System.out.println("成績輸入錯誤!");
					}
					else 
						break;
				}catch(Exception e){
					System.out.println("成績輸入錯誤!");
					input.next();
				}
			}
		}
		try{
			System.out.print("查詢:輸入學生編號:");
			int num=input.nextInt();
			if(num>=1&&num<=3){
				System.out.println("查詢結果:編號"+num+" 姓名"+name[num-1]+" 成績"+grade[num-1]);
			}
			else{
				System.out.println("查無編號");
			}
		}catch(Exception e){
			System.out.println("輸入錯誤");
		}
	}
}