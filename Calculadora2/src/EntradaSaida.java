import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaSaida {
	static void cout(String str) {
		System.out.println(str);
	}
	static void countln(String str) {
		System.out.println(str);
	}
	static String cin() throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(in);
	String str = br.readLine();
		return str;
	}
	static double cind() throws IOException {
		String str = cin();
		double d = 0;
	int i = 0;
	while (i <str.length()) {
		if((str.charAt(i) >= '0' && str.charAt(i) <= '9') ||
		str.charAt(i) == '.' || str.charAt(i) == '-')
		{i++;continue;}
		else return d;
	}
			d = Double.parseDouble(str);
			return d;
	}
	static char cinch() throws IOException {
		String str = cin();
		char ch = 'e';
			if(str.length()>=1)
				ch = str.charAt(0);
			return ch;
	}
}
