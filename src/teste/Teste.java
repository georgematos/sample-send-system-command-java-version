package teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teste {

	public static void main(String[] args) {

//		try {
//			Process process = Runtime.getRuntime().exec("java --version");
//			BufferedReader buffReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//			String output;
//			while ((output = buffReader.readLine()) != null) {
//				System.out.println(output);
//			}
//			buffReader.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// Java 8 way

		try {

			Process process = Runtime.getRuntime().exec("java --version");
			BufferedReader buffReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			buffReader.lines().forEach(System.out::println);
			buffReader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
