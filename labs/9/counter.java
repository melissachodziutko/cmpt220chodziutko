//package hrlp;

import java.io.*;
import java.util.*;

public class counter {
	public static void main(String[] args) throws Exception {
		File file = new File(args[0]);
		

		int characters = 0;// characters
		int words = 0;	// words
		int lines = 0;	// lines

		try (
			//input
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				lines++;
				String line = input.nextLine();
				characters += line.length();
			}
		}

		try (
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				String line = input.next();
				words++;
			}
		}

		// print results
		System.out.println(file.getName() + " has");
		System.out.println(characters + " characters");
		System.out.println(words + "words");
		System.out.println(lines + " line");
	}
}
