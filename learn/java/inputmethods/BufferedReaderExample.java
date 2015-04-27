package learn.java.inputmethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name = 	bufferedreader.readLine();
		System.out.println("Enter your age:");
		int age = Integer.parseInt(bufferedreader.readLine());
		System.out.println("eh ... try your age again. Truthfully, this time:");
		int age1 = bufferedreader.read();//reads a character, not in int.
		System.out.println("I am "+name+" "+age +" years old ... or am I " +age1+"?");
		System.out.println("... wait ... I didn't say "+age1+"!!");
		System.out.println("... This computer is playing mind tricks with me :)"
				+ "\nWell, actually the BufferredReader.read() function reads"
				+ "\nin one character only and converts it into ASCII number representation."
				+ "\nThe number you typed in had the first character \""+(age1-48)+"\", which is ASCII number \""+age1+"\"."
				+ "\nSo we almost never use read(), but only readLine(). Checkout other methods available as well.");
	}
}