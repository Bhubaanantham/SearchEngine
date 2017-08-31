import java.util.*;
public class Prime 
{
	public static void primeNum()
	{
		Set<Integer> set=new TreeSet<Integer>();
		int count=0;
		int sum=0;
		int temp=0;
		for(int a=1;a<100;a++)
		{
			sum=0;
			temp=0;
			count=0;
			for(int j=a;j>=1;j--)
			{
				if(a%j==0)
        		{
					count++;	
        		}	
			}
        
			temp=a;
			if(count==2)
			{
				while(temp>0)
				{
					sum+=temp%10;
					temp=temp/10;
				}
				if(sum<100)
				{
					count=0;
					for(int j=sum;j>=1;j--)
					{
						if(sum%j==0){
							count++;
						}
             	
					}
					if(count==2)
					{
						if(set.contains(sum)){}
						else
						{
							set.add(sum);
							System.out.println(sum);
						}
					}
				}
        
			}
		}
	}
	public static void main(String[] args)
	{
		primeNumber();
	}
}