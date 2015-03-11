import java.util.*;
class Oval {
	double a, b;
	public Oval(double a, double b)
	{
		double temp;
		if(b>a){
			temp=a;
			a=b;
			b=temp;
		}
		this.a=a;
		this.b=b;
	}
	public double area() 
	{
		return 3.14*a*b;
	}
	public double perimeter() 
	{
		return 2*3.14*b+4*(a-b);
	}
}
class OvalTest{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Oval[] oval = new Oval[3];
		for(int i=0;i<3;i++){
			try{
				System.out.print("¿é¤J¾ò¶ê"+(i+1)+"ªø¥b¶b©Mµu¥b¶b:");
				double a=input.nextDouble();
				double b=input.nextDouble();
				oval[i]=new Oval(a,b);
			}
			catch(Exception e){
				System.out.println("¿é¤J¿ù»~");
				input.next();
				i--;
			}
		}
		for(int i=0;i<3;i++){
			System.out.println("¾ò¶ê"+(i+1)+"­±¿n:"+oval[i].area()+"©Pªø:"+oval[i].perimeter());
		}
	}
}