import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Mathe {

	public static void main(String[] args) {
		Random rnd = new Random();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true) {
				int a = rnd.nextInt(100);
				int b = rnd.nextInt(a);
				int antwort = 0;
				
				while(true) {
					System.out.print(a+"-"+b+"=");
					antwort = Integer.parseInt(in.readLine());
					if (antwort == a-b)
						break;
					else
						System.out.println("/-(");
				}
				System.out.println(":-)");
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}

}
