import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

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
		// File datei2 = new File("C:\\neueDatei.txt");
		// int anzahlZeilen = 0;
		// int charsZeile = 0;
		String Text = "=jhg=5====k==j==h  ";
		// try {
		// FileReader dateileser = new FileReader(datei2);
		// BufferedReader einleser = new BufferedReader(dateileser);
		// while (einleser.ready()) {
		// String zeile = einleser.readLine();
		// System.out.println(zeile);
		// anzahlZeilen++;
		// charsZeile += zeile.length();
		// }
		// einleser.close();
		// } catch (FileNotFoundException e) {
		// System.out.println("Datei nicht gefunden" + e.getMessage());
		// } catch (IOException e) {
		// System.out.println("Fehler im Modul");
		// }
		// System.out.println((charsZeile / anzahlZeilen));
		// System.out.println(anzahlZeilen);
		// System.out.println(Text);
		// System.out.println(löschen(Text));
		Printer drucker = new Printer();
		try {
			drucker.dateiSchreiben(Text, drucker.dateiErstellen(drucker
					.dateipfaderstellen(JOptionPane
							.showInputDialog("Gib den Daeipfad ein")), "test"));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public static boolean auswertung(char buchstabe) {
		if (buchstabe == '=') {
			return false;
		}
		return true;
	}

	public static String löschen(String text) {
		String neuertext = "";
		for (int i = 0; i < text.length(); i++) {
			if (auswertung(text.charAt(i))) {
				neuertext = neuertext + text.charAt(i);
			}
		}
		return neuertext;
	}
}
