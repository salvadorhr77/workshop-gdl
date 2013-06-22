
import java.io.*;
import java.net.*;

public class Cliente22 {

	static BufferedReader readInput;

	public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }
	
	public void establishConnection(String mensaje) throws IOException {
		final String IP = "localhost";
		final Integer PORT = 3550;
		Socket s = new Socket(IP, PORT);

		InputStreamReader stream = new InputStreamReader(s.getInputStream());
		BufferedReader reader = new BufferedReader(stream);

		PrintWriter writer = new PrintWriter(s.getOutputStream());
		writer.print(mensaje);
		writer.flush();
		
		String str = null;
		while ((str = reader.readLine()) != null) {
			System.out.println(str + "\n");
		}
		writer.close();
		reader.close();
		s.close();
	}

	public static void main(String... salvador) throws IOException {

		//String mensaje = "";
		readInput = new BufferedReader(new InputStreamReader(System.in));
		
		String str2 = String.format("%-126s", readInput.readLine()).replace(' ', ' ') + "\n";
		System.out.println("Mensaje Enviado como parametro 'RFC': " 
		+str2 + str2.length() + "\n");

		new Cliente22().establishConnection(str2);
	}
}
