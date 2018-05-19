import java.util.Arrays;

public class StringManup {
		
		
		public void AsciiToString(String data)
		{
			String txt =data;
			char[] ch= txt.toCharArray();
			for (char mychar : ch) {
				int myint = (int) mychar;
				int mystrval= myint+1;
				
				char  mystring = (char)mystrval;
				System.out.print(mystring);
			}
		}
		
		public void  NoOfoccurence(String data1,char data2) {
			int i=0;
			char[] ch= data1.toCharArray();
			for (char c : ch) {
				if( c == data2 )
				{
				 i= i+1;
				}
			}
			
			System.out.println();
			System.out.println(i);
			
		}
		
				
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StringManup a1 = new StringManup();
					a1.AsciiToString("a1b2c3");
					a1.NoOfoccurence("testleaf", 't');
					a1.AsciiToString("x5");
		}
	}
