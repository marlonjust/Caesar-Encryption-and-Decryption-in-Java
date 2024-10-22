package caesar;
import java.util.Scanner;
/* 1. Codieren Sie A = 0, B = 1,...
 * 2. Verschlüsseln Sie "Modulorechnen mit y = x + e (mod 26) mit e = 5
 * 3. Wieder entschlüsseln
 * */

public class caesar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.println("(1): Nachricht verschlüsseln");
		System.out.println("(2): Nachricht entschlüsseln");
		int auswahl = scan.nextInt();
		scan.nextLine(); //Beispiel Eingabe: 1 wird zu 1\n und scan.nextLine in Switch-Case funktioniert nicht.
		
		switch (auswahl) {
		case 1: {
			System.out.print("Bitte Nachricht eingeben: ");
			String message = scan.nextLine();
			System.out.print("Bitte Schlüssel eingeben: ");
			int schluessel = scan.nextInt();
			System.out.println(verschluesseln(alphabetUpper, alphabetLower, message, schluessel));
			break;
		}
		case 2: {
			System.out.print("Bitte Nachricht eingeben: ");
			String message = scan.nextLine();
			System.out.print("Bitte Schlüssel eingeben: ");
			int schluessel = scan.nextInt();
			System.out.println(entschluesseln(alphabetUpper, alphabetLower, message, schluessel));
			break;
		}
		default:
			System.out.println("Nur 1 oder 2 sind gültige Möglichkeiten.");
		}
		scan.close();	
	}
	
	public static String verschluesseln(String alphabetUpper, String alphabetLower, String message, int schluessel) {
		String verschluesselt = "";

		for (int i = 0; i < message.length(); i++) {
			char zeichen = message.charAt(i); //Zugriff auf Buchstaben der message
			if (Character.isUpperCase(zeichen)) {
				int position = alphabetUpper.indexOf(zeichen); //Position von Zeichen aus message im alphabet bspw. A = 0 und D = 3;
				int verschiebung = (position + schluessel) % 26; //Verschiebung -> neue Position im alphabet
				verschluesselt = verschluesselt + alphabetUpper.charAt(verschiebung); //String wird gefüllt mit den chars an der Stelle "verschiebung"
			}
			else if (Character.isLowerCase(zeichen)) {
				int position = alphabetLower.indexOf(zeichen); //Position von Zeichen aus message im alphabet bspw. a = 0 und d = 3;
				int verschiebung = (position + schluessel) % 26; //Verschiebung -> neue Position im alphabet
				verschluesselt = verschluesselt + alphabetLower.charAt(verschiebung); //String wird gefüllt mit den chars an der Stelle "verschiebung"
			}
			else {
				verschluesselt = verschluesselt + zeichen;
			}
		}
		return(verschluesselt);
	}
	
	public static String entschluesseln(String alphabetUpper, String alphabetLower, String message, int schluessel) { //Rückwärts Verschiebung
		String entschluesselt = "";

		for (int i = 0; i < message.length(); i++) {
			char zeichen = message.charAt(i); //Zugriff auf Buchstaben der message
			if (Character.isUpperCase(zeichen)) {
				int position = alphabetUpper.indexOf(zeichen);//Alphabet wird nach der Position des chars durchsucht, A = 0, D = 3 usw...
				int verschiebung = (position - schluessel + 26) % 26; //Verschiebung -> neue Position im alphabet //+26 um negative Zahlen zu verhindern
				entschluesselt = entschluesselt + alphabetUpper.charAt(verschiebung); //String wird gefüllt mit den chars an der Stelle "verschiebung"
			}
			else if (Character.isLowerCase(zeichen)) {
				int position = alphabetLower.indexOf(zeichen); //Position von Zeichen aus message im alphabet bspw. a = 0 und d = 3;
				int verschiebung = (position - schluessel + 26) % 26; //Verschiebung -> neue Position im alphabet //+26 um negative Zahlen zu verhindern
				entschluesselt = entschluesselt + alphabetLower.charAt(verschiebung); //String wird gefüllt mit den chars an der Stelle "verschiebung"
			}
			else {
				entschluesselt = entschluesselt + zeichen;
			}
		}
		return(entschluesselt);
		
	}
}