import java.util.*;

public class NumberFormatExep {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		try {
			int x=in.nextInt();
			System.out.println(x*x);
		}
		catch(Exception e) {
			System.out.println("Entered Input is invalid format");
		}

	}

}
