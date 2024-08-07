import java.util.*;

class GFG
{

static void convert12(String str)
{
// Get Hours
	int h1 = (int)str.charAt(0) - '0';
	int h2 = (int)str.charAt(1)- '0';

	int hh = h1 * 10 + h2;

	// Finding out the Meridien of time
	// ie. AM or PM
	String Meridien;
	if (hh < 12) {
		Meridien = "AM";
	}
	else
		Meridien = "PM";

	hh %= 12;
	if (hh == 0) {
		System.out.print("12");

		// Printing minutes and seconds
		for (int i = 2; i < 8; ++i) {
		System.out.print(str.charAt(i));
		}
	}
	else {
		System.out.print(hh);
		// Printing minutes and seconds
		for (int i = 2; i < 8; ++i) {
		System.out.print(str.charAt(i));
		}
	}

	// After time is printed
	// cout Meridien
System.out.println(" "+Meridien);
}

//Driver code
public static void main(String ar[])
{

      // madhu has done this code
	Scanner sc = new Scanner(System.in);
	int tc = sc.nextInt();
	while(tc-- >0){
	// code here
	String str = sc.next();

		convert12(str);

	}

}
}
