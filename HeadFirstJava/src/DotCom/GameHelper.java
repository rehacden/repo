package DotCom;

import java.io.*;

public class GameHelper {
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + " ");
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		try {
			inputLine = is.readLine();
		} catch (IOException e) {
			System.out.println("IOException " + e);
			e.printStackTrace();
		}
		if (inputLine.length() == 0) {
			return null;
		}
		return inputLine;
	}

}
