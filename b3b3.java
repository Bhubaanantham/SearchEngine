import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		in.close();
		int alpha=0;
		int nu=0;
		int sp=0;
		for(int x=0;x<str.length();x++) {
			char ch=str.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
				alpha++;
			}
			else if(ch>='0'&&ch<='9') {
				nu++;
			}
			else {
				sp++;
			}
		}
		System.out.println("alpha:"+alpha+" number:"+nu+" special:"+sp);
	}

}