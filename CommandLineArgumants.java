public class CommandLineArgumants { 
	static int parse(String s) { 
		return Integer.parseInt(s); 
	} 
 
	public static void main(String[] args) { 
		int sum = 0; 
 
		for(int i = 0; i < args.length; i++) 
			sum= sum + CommandLineArgumants.parse( args[i] ); 
		
		System.out.println("sum is="+sum);
	} 
} 