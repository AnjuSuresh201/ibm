
public class CmdLineDemo {

	public static void main(String[] args) {
		//for (String arg : args) {
			//System.out.println(arg);
		
		int sum=0;
		for (String num : args) {
			sum += Integer.parseInt(num);	//convert string into int and then calculate the sum		
		}
		System.out.println("Sum: " + sum);
	}

}
