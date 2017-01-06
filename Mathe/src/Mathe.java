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
				int b = rnd.nextInt(100-a);
				System.out.print(a+"+"+b+"=");
				int antwort = Integer.parseInt(in.readLine());
				if (antwort == a+b){
					System.out.println(":-)");
				}else{
					System.out.println("/-(");
				}
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}

}
