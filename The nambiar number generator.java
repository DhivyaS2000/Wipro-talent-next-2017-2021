import java.io.*;
import  java.util.*;

// Read only region start
class TheNambiarNumberGenerator {

	public int nnGenerator(String input1){
		// Read only region end
		String mobNo = input1;
		StringBuilder nambiarNo = new StringBuilder();

		for (int i = 0; i < mobNo.length(); i++) {
			int fd = Integer.parseInt(String.valueOf(mobNo.charAt(i)));
			int firstDigitEvenOrOdd = fd % 2 == 0 ? 0 : 1; 
			int sum = fd;
			int j = i + 1;

			if (j == mobNo.length()) {
				nambiarNo.append(fd);
				break;
			}

			while (true) {
				sum += Integer.parseInt(String.valueOf(mobNo.charAt(j++)));

				if (sum % 2 != firstDigitEvenOrOdd || j >= mobNo.length()) {
					nambiarNo.append(sum);
					i = j - 1;
					break;
				}
			}
		}
		
		return Integer.parseInt(nambiarNo.toString());
	}
}