import java.util.Scanner;

public class LcmTwoNo {
	public static void main(String[] args){
		int i,j,x,y,k,hcf,lcm;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("enter the two numbers:");
		i=x;
		j=y;
		while(j!=0){
			k=j;
			j=i%j;
			i=k;
		}
		hcf=i;
		lcm=(x*y)/hcf;
		System.out.println("Hcf="+hcf);
		System.out.println("\nlcm="+lcm);
}
}