import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Printer {

	public Printer() {
	}

	public void dateiSchreiben(String text, File datei)
			throws FileNotFoundException {
		FileOutputStream dateiSchreiber = new FileOutputStream(datei);
		PrintStream schreiber = new PrintStream(dateiSchreiber);
		schreiber.println(text);
		schreiber.close();
	}

	public File dateiErstellen(String pfad, String dateiName) {
		File datei = new File(pfad + "\\" + dateiName + ".txt");
		return datei;
	}
	public String dateipfaderstellen(String pfad){
		String pfadkorrekt = "";
		for (int i = 0; i < pfad.length(); i++) {
			pfadkorrekt += pfad.charAt(i);
			if (pfad.charAt(i) == '\\') {
				pfadkorrekt += "\\";
			}
		}
		return pfadkorrekt;
	}
}

