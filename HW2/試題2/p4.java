import java.util.*;
class p4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] name=new String[3];
		int[] grade={-1,-1,-1};
		for(int i=0;i<3;i++){
			System.out.print("�ǥ�"+(i+1)+"�m�W:");
			name[i]=new String(input.next());
			while(true){
				try{
					System.out.print("�ǥ�"+(i+1)+"���Z:");
					grade[i]=input.nextInt();
					if(grade[i]<0 || grade[i]>100){
						System.out.println("���Z��J���~!");
					}
					else 
						break;
				}catch(Exception e){
					System.out.println("���Z��J���~!");
					input.next();
				}
			}
		}
		try{
			System.out.print("�d��:��J�ǥͽs��:");
			int num=input.nextInt();
			if(num>=1&&num<=3){
				System.out.println("�d�ߵ��G:�s��"+num+" �m�W"+name[num-1]+" ���Z"+grade[num-1]);
			}
			else{
				System.out.println("�d�L�s��");
			}
		}catch(Exception e){
			System.out.println("��J���~");
		}
	}
}