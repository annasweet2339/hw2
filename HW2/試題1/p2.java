class p2 {
	public static void main(String[] args) {
		int num[]={1,2,3,4,5};
		int total=0;
		for(int i=0;i<num.length;i++){
			total+=num[i];
		}
		int average=total/5;
		for(int i=0;i<num.length;i++)
			System.out.print(num[i]+" ");
		System.out.println("\n�`�M:"+total+"����:"+average);
	}
}