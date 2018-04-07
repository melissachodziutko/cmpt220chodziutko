package hrlp;

public class removetext{
ArrayList<a> s2 = new ArrayList<>(); 
		try (
			// input
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				s2.add(removeString(s1));
			}
		}

		try (
			// output
			PrintWriter output = new PrintWriter(file);
		) {
			for (int i = 0; i < s2.size(); i++) {
				output.println(s2.get(i));
			}
		}
	}

	public static String removeString(String string, String line) {
		StringBuilder stringBuilder = new StringBuilder(line);
		int start = stringBuilder.indexOf(string); 
		int end = string.length(); 

		while (start > 0) {
			end = start + end;
			stringBuilder = stringBuilder.delete(start, end);
		}

		return stringBuilder
	}
