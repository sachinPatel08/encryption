import java.util.*;

class Main
{

static int binaryToDecimal(String n)
{
	String num = n;
	int dec_value = 0;
	int base = 1;
    int val=0;
	int len = num.length();
	for (int i = len - 1; i >= 0; i--) {

		if (num.charAt(i) == '1')
			dec_value += base;
		base = base * 2;
	}
    val= (char)(dec_value % 26 + 'A');
    System.out.println(val);
	return val;
}


static String setStringtoASCII(String str)
{
	int N = (str.length());

	if (N % 8 != 0) {
		return "Not Possible!";
	}

	String res = "";

	for (int i = 0; i < N; i += 8) {
		int decimal_value
			= binaryToDecimal((str.substring(i, 8+i)));
		res += (char)(decimal_value);
	}

	return res;
}

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
	String s="";
   System.out.println("Enter Plain Text:");
    s=sc.nextLine();
	  byte[] bytes = s.getBytes();
	  StringBuilder binary = new StringBuilder();
	  for (byte b : bytes)
	  {
	     int val = b;
	     for (int i = 0; i < 8; i++)
	     {
	        binary.append((val & 128) == 0 ? 1 : 0);
	        val <<= 1;
	     }
	     binary.append("");
	      
	  }
	  
	String result = binary.toString();
	System.out.println(result);
	System.out.print(setStringtoASCII(result));

}
}

