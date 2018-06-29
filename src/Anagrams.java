import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Anagrams {
	String word;
	ArrayList<String> words;

	void setup() {
		words = new ArrayList<String>();

		try {
			BufferedReader read = new BufferedReader(new FileReader("src/words.txt"));

			String line = read.readLine();
			while (line != null) {
				words.add(line);
				line = read.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void anagram() {
		ArrayList<String> anagrams = new ArrayList<String>();
		ArrayList<String> doubles;
		word = JOptionPane.showInputDialog("Give me a word for all it's anagrams");
		for (int i = 0; i < words.size(); i++) {
			doubles = new ArrayList<String>();
			boolean x = false;
			if (word.length() == words.get(i).length()) {
				// for (int j = 0; j < word.length(); j++) {
				// if(words.get(i).contains(word.substring(j, j+1))) {
				// if(doubles.contains(word.substring(j, j+1))==false) {
				// x+=1;
				// doubles.add(word.substring(j, j+1));

				// }
				// }
				// }
				char[] a1 = word.toCharArray();
				char[] a2 = words.get(i).toCharArray();
				for (int j = 0; j < a1.length; j++) {
					for (int k = 0; k < a1.length - 1; k++) {
						if (a1[k] > (a1[k + 1])) {
							char temp = a1[k];
							a1[k] = a1[k + 1];
							a1[k + 1] = temp;

						}
					}
				}
				for (int j = 0; j < a2.length; j++) {
					for (int k = 0; k < a2.length - 1; k++) {
						if (a2[k] > (a2[k + 1])) {
							char temp = a2[k];
							a2[k] = a2[k + 1];
							a2[k + 1] = temp;

						}
					}
				}
				if (Arrays.equals(a1, a2)) {
					x = true;
				}
			}
			if (x == true) {
				anagrams.add(words.get(i));
			}

		}
		if (anagrams.size() > 0) {
			System.out.println(anagrams);
		} else {
			System.out.println("[No words found]");
		}
	}

	public static void main(String[] args) {
		Anagrams a = new Anagrams();
		a.setup();
		a.anagram();

	}
}
