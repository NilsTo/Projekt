import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Datenerfassung {

	public static void main(String[] args) {
		ArrayList<Integer> Zahlen = erfassen();
		System.out.println(Zahlen);
		System.out.println(mittelwert(Zahlen));
		System.out.println(geomittel(Zahlen));
		System.out.println(aussortieren(Zahlen, mittelwert(Zahlen), geomittel(Zahlen)));

	}

	public static ArrayList<Integer> erfassen() {
		ArrayList<Integer> liste = new ArrayList<Integer>();
		int abbruch = 0;
		while (true) {
			String z = JOptionPane.showInputDialog("Zahl eingeben");
			if (z == null || z.equals("")) {
				return liste;
			}
			try {
				int zahl = Integer.parseInt(z);
				liste.add(zahl);
			} catch (NumberFormatException fehler) {
				JOptionPane.showMessageDialog(null, "Falsche Eingabe");
				abbruch++;
				if (abbruch == 3) {
					JOptionPane.showMessageDialog(null,
							"Zu viele falsche Eingaben");
					return liste;
				}
			}

		}

	}

	public static double mittelwert(ArrayList<Integer> liste) {
		double mittelwert = 0;
		for (int i = 0; i < liste.size(); i++) {
			mittelwert += liste.get(i);
		}
		mittelwert = mittelwert / liste.size();
		return mittelwert;
	}

	public static double geomittel(ArrayList<Integer> liste) {
		double ergebnis = liste.get(0);
		for (int i = 1; i < liste.size(); i++) {
			ergebnis = ergebnis * liste.get(i);
		}
		double wurzel = liste.size();
		ergebnis = Math.pow(ergebnis, (1 / wurzel));
		return ergebnis;
	}

	public static ArrayList<Integer> aussortieren(ArrayList<Integer> liste,
			double mittelwert, double geomittel) {
		ArrayList<Integer> neueListe = new ArrayList<Integer>();
		for (int i = 0; i < liste.size(); i++) {
			if ((liste.get(i) > (0.5 * mittelwert)
					|| liste.get(i) > (0.5 * geomittel)) &&
					 (liste.get(i) < (1.5 * mittelwert)
					|| liste.get(i) < (1.5 * geomittel))) {
				neueListe.add(liste.get(i));
			}
		}
		return neueListe;
	}
}
