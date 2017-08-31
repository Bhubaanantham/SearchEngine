
public class Ascii {

	public static void main(String[] args) 
	{
		String str;
		for(int a=0;a<255;a++)
		{
			str=new Character((char)a).toString();
			System.out.println(a+" "+str);
		}
	

	}

}