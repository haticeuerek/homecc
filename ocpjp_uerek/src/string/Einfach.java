package string;

public class Einfach {

	public static void main(String[] args) {
		String s = "Java ist toll";
		System.out.println(s);
		String[] s1 = s.split(" ");
		
		for (int i = s1.length; i > 0; i--) {
			for (int j = s1[i-1].length(); j > 0; j--) {
				System.out.print(s1[i-1].charAt(j-1));
			}
			System.out.print(" ");
		}
		
		
	

	}

}
