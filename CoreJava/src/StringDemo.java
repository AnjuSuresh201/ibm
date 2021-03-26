
public class StringDemo {

	public static void main(String[] args) {
		String s1="Hello";
		String s2= new String("Hello");
		String s3="Hello";
		
		System.out.println(s1);
		
		//Here we are comparing the address not the content
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		s1=s1 + "world"; //when manipulated a new memory location is assigned to modified string
		
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 7));
		
		System.out.println(s1.replace('o', 'a'));
		System.out.println(s1);
		
		String week="Sun-Mon-Tue-Wed-Thur-Fri-Sat";
		String[] split=week.split("-");
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);
		}
		
		

	}

}
