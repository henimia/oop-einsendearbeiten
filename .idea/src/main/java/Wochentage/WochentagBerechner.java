package Wochentage;

/*Zu jedem beliebigen Datum kann der zugehörige Wochentag mit folgender Formel berechnet werden:
w = (d + (26 * (m + 1))/10 + (5 * y)/4 + c/4 + 5 * c - 1) mod 7
d steht für den Tag
m steht für den Monat
y bezeichnet sind die letzten beiden Ziffern des Jahres
c ist das Jahrhundert
w ist der Wochentag, wobei 0 für Sonntag und 6 für Samstag steht
Allerdings muss berücksichtigt werden, dass der Monat Januar als 13.
Monat und Februar als 14. Monat des Vorjahres dargestellt werden müssen.

Die Belegung für den 5. Juni 2009, sähe also folgendermassen aus:
d = 5, m = 6, y = 9 und c = 20
und die für den 17. Februar 1980 wäre:
d = 17, m = 14, y = 79, c = 19.

Ergänzen Sie nun den nachfolgenden Quelltext.
Dabei soll am Schluss die Ausgabe des Wochentages erfolgen,
z. B. soll für den 5.6.2009 die Ausgabe Freitag erscheinen.*/

public class WochentagBerechner {

    /**
     * es wird der Wochentag zu einem gueltigen Datum bestimmt
     *
     * @param tag der Tag (0 < tag <= 31)
     * @param monat der Monat (0 < monat <= 12)
     * @param jahr die vierstellige Jahreszahl (z. B. 2009)
     */
    public void berechneWochentag(int tag, int monat, int jahr) {
        int j = jahr;
        int m = monat;
        int d = tag;
        // Januar oder Februar als Monat 13 bzw. 14 des Vorjahres darstellen
        if (m == 1 || m == 2) {
            m += 12;
            j--;
        }
        int y = j % 100; // letzten Beiden Ziffern des Jahre bestimmen
        int c = j / 100; // Jahrhunder bestimmen
        int w = (d + (26 * (m + 1)) / 10 + (5 * y) / 4 + c / 4 + 5 * c - 1) % 7;
        switch (w) {
            case 0:
                System.out.print("Sonntag");
                break;
            case 1:
                System.out.print("Montag");
                break;
            case 2:
                System.out.print("Dienstag");
                break;
            case 3:
                System.out.print("Mittwoch");
                break;
            case 4:
                System.out.print("Donnerstag");
                break;
            case 5:
                System.out.print("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
        }
    }
}
