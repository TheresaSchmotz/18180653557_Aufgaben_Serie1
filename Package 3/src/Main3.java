public class Main3 {
    public static void main(String[] args) {
        String name = "Theresa Schmotz";
        int alter = 19;
        final String FH_KUFSTEIN_TIROL = "Fachhochschule Kufstein Tirol";
        /**Man hat einfach den Variablennamen(fachhochschuleKufsteinTirol -> fhKufsteinTirol) ausgestauscht;
         variable FH_KUFSTEIN_TIROL ist jetzt final und kann zur laufzeit nichtmehr verändert werden.
         */
        System.out.println(name);       //Erwartete Ausgabe: Theresa Schmotz
        System.out.println(19);         //Erwartete Ausgabe: 19


        //Aufgabe 5
        final String Baum;



        //Aufgabe 6
        System.out.println("Java verwendet für Strings \"doppelte Anführungszeichen\" und einzelne Anführungszeichen\n" + "wie 'c' um einzelne Zeichen zu definieren.");
        System.out.println("Durch \\ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\\\\\");
        System.out.println("Ich verwende den \\bBackspace, die Newline\\n und den \\tTabulator.");
        /**Erwartete Ausgabe:
         * Java verwendet für Strings "doppelte Anführungszeichen" und einzelne Anführungszeichen
         * wie 'c' um einzelne Zeichen zu definieren.
         * Durch \ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\
         * Ich verwende den \bBackspace, die Newline\n und den \tTabulator.
         */


        //Aufgabe 7
        System.out.println("Ich \rverwende den \\bBackspace, die \fNewline\\n und den \\tTabulator.");
        /**Durch \r wird der anfang des Textes der in dieser Zeile ausgegeben werden soll durch den restlichen Teli des Satzes überschrieben.
         * mit /f erscheint ein Pfeil nach oben.
         * Erwartete Ausgabe: verwende den \bBackspace, die Newline\n und den \tTabulator.
         */
    }
}



