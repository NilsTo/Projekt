import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class JavaIO {

	public static void main(String[] args) {
		// File datei1 = new File("C:\\neueDatei.txt");
		// try {
		// FileOutputStream dateischreiber = new FileOutputStream(datei1);
		// PrintStream textschreiber = new PrintStream(dateischreiber);
		// textschreiber.println("Hallo das ist ein Versuch");
		// textschreiber.println("Sieht gut aus");
		// textschreiber.close();
		// } catch (FileNotFoundException e){
		// System.out.println(e.getMessage());
		// }
		File datei2 = new File("C:\\neueDatei.txt");
		int anzahlZeilen = 0;
		int charsZeile = 0;
		String Text = "gjhg = kjh  ";
		try {
			FileReader dateileser = new FileReader(datei2);
			BufferedReader einleser = new BufferedReader(dateileser);
			while (einleser.ready()) {
				String zeile = einleser.readLine();
				System.out.println(zeile);
				anzahlZeilen++;
				charsZeile += zeile.length();
			}
			einleser.close();
		} catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Fehler im Modul");
		}
		System.out.println((charsZeile / anzahlZeilen));
		System.out.println(anzahlZeilen);
		System.out.println(auswertung(Text));
	}
	public static boolean auswertung(String zeile){
		for (int i = 1; i <= zeile.length();i++){
			if (zeile.charAt(i) == '='){
				return true;
			}
		}
		return false;
	}
}
