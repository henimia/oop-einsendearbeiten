package Primzahltest;

/*Eine Primzahl ist eine Zahl, die nur durch 1 und sich selbst (ohne Rest) teilbar ist.
Ergänzen Sie nun den Quelltext, um zu überprüfen ob es sich bei n um eine Primzahl handelt.
Wenn n eine Primzahl ist, soll JA, ansonsten NEIN ausgegeben werden.
Beachten Sie dabei die Großschreibung der Ausgabe.
Um zu überprüfen ob eine Zahl eine andere ohne Rest teilt, kann die Operation Modulo (%) verwendet werden.
Wenn a % b == 0 zu true ausgewertet wird, so ist b ein Teiler von a.*/


public class PrimzahlTester {
    /**
     * prueft ob die uebergebene nichtnegative Zahl eine Primzahl ist
     * wenn die uebergebene Zahl eine Primzahl ist, wir JA ausgegeben
     * ansonsten NEIN
     *
     * @param n die zu testende nichtnegative Zahl
     */
    public void istPrimzahl(long n) {
        boolean istPrimzahl = true;
        if (n < 2) {
            // 2 ist die kleinste Primzahl
            istPrimzahl = false;
        } else if (n == 2) {
            // 2 ist eine Primzahl
            istPrimzahl = true;
        } else if (n % 2 == 0) {
            // eine gerade Zahl kann keine Primzahl sein
            istPrimzahl = false;
        } else {
            // ueberpruefen ob eine ungerade Zahl n teilt
            // es reicht eine Ueberpruefung bis i * i > n ist
            for (long i = 3; i * i <= n; i += 2) {
                if (n % i == 0) {
                    // wenn es einen Teiler gibt, ist n keine Primzahl
                    istPrimzahl = false;
                }
            }
        }
        if (istPrimzahl) {
            System.out.println("JA");
        } else {
            System.out.println("NEIN");
        }
    }
}
