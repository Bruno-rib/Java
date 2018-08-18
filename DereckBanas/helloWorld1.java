package DereckBanas;

//public available to all other classes
public class helloWorld1 {
	
	//variable
	static String randomString = "String to print";
	
	//FINAL: constant. name should be all uppercase letter
	static final double PINUM = 3.141529;
	
	//integers –2147483648 to 2147483647
	static int integerOne, integerTwo = 2147483647;

	//from 127 to -128
	static byte bigByte = -128;
	
	//-32768 to 32767
	static short bigShort = 32767;
	
	//16 digits. "L" identifies long and does not show in print
	static long bigLong = 5L;
	
	//float: decimals
	static float bigFloat = 3.14F;
	
	//double is a bigger and more precise float
	static double bigDouble = 3.14;
	
	static boolean trueOrFalse = true;
	
	//static: only a class can call for this function to execute
	//void: does not return any values
	//String[] args: every main function must accept an array of objects
	public static void main (String[] args) {
		
		char randomChar = 65;
		char anotherChar = 'A';
		char escapeChars = '\n';
		
		//string an object. String of characters inside double quotes
		String randomString = "I'm a random string";
		String anotherString = "Stuff";
		String andAnotherString = randomString + ' ' + anotherString;
		
		//convert types to string
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigShort);
		String intString = Integer.toString(integerTwo );
		String longString = Long.toString(bigLong);
		String floatString = Float.toString(bigFloat);
		String doubleString = Double.toString(bigDouble);
		String booleanString = Boolean.toString(trueOrFalse);
		
		//convert double to types (float, boolean, char dont work)
		//if double is bigger than int can hold will just show max int size of 2147483647
		double aDoubleValue = 3.14546466464;
		int doubleToInt = (int) aDoubleValue;
		
		
		//string to all other types but char
		int stringToInt = Integer.parseInt(intString);
		
		
		//println object that outputs in different ways
		System.out.println("hello");
		System.out.println(randomString);
		System.out.println(PINUM);
		System.out.println(integerOne + "  " + integerTwo);
		System.out.println(bigByte);
		System.out.println(bigShort);
		System.out.println(bigLong);
		System.out.println(bigFloat);
		System.out.println(bigDouble);
		System.out.println(Double.MAX_VALUE); //max value to any type
		System.out.println(trueOrFalse);
		System.out.println(randomChar);
		System.out.println(anotherChar);
		System.out.println(escapeChars);
		System.out.println(andAnotherString);
		System.out.println(intString);
		System.out.println(doubleToInt);
		System.out.println(stringToInt);
	}
}