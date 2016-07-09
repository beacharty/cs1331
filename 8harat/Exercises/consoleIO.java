import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;

//call consoleIO with the name of a text file in the folder
public class consoleIO {
	public static void main(String[] args) throws Exception {
		String inf = args[0];
		String name = inf.substring(0, inf.length() - 4);
		name = name.toUpperCase();
		
		PrintStream outf = new PrintStream(new File(name + ".txt"));
		Scanner scan = new Scanner(new File(inf));
		
		while (scan.hasNext()) {
			String line = scan.nextLine();
			line = line.toUpperCase();
			outf.println(line);
		}
		System.out.println("File Made!");
	}
}