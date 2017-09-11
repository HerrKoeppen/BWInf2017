/*
 * BWInf - Junioraufgabe 1
 * Aufgabenblatt: https://www.bwinf.de/fileadmin/user_upload/BwInf/2017/36/1._Runde/Aufgaben/BWINF_36_Aufgaben_WEB.pdf
 * Material für Testeingaben: https://www.bwinf.de/bundeswettbewerb/der-36-bwinf/1-runde/material-361/
 *
 * Gegeben ist eine Vorgabe an Dekofiguren und eine Anzahl an Buechern und die Hoehe der einzelnen Buecher.
 * Die Buecher sollen so gruppiert werden, dass der maximale Abstand zwischen kleinstem und groesstem Buch 30mm ist.
 * Zwischen den Gruppen steht jeweils eine Dekofigur. Es gibt also Dekofiguren+1 Abtrennungen.
 *
 * Die Aufgabe soll zum Testen von netbeans, github und junit verwendet werden.
 * Eine Loesung ist zu entwerfen, kommentierte Methoden sind zu erstellen und vor deren Implementierung sind Testfaelle in junit zu bauen.
 */
package junior1;

import java.util.ArrayList;

/**
 *
 * @author koeppen
 */
public class Buecherregal {

    int anzahlDekofiguren;
    ArrayList<Integer> buecher;
    ArrayList<ArrayList<Integer>> gruppen;

    public void dateiNachAufgabe() {
        //Anlegen eines Filechoosers zur korrekten Dateiauswahl
        //Umwandeln der Dateiinhalte in ein Buecherregalobjekt (Anzahl Dekofiguren, ArrayList von Buechergroessen)
    }

    public void gruppiere() {
        //Suchen des Minimums der Buecherliste, dieses markiert den Beginn eines Fachs
        //In die naechste ArrayList der gruppen als erstes Element einfuegen
        //Minimum merken, aber aus der Buecherliste entfernen
        //Durchgehen aller anderen Buecher und diejenigen, die einen Unterschied von maximal 30mm zum Minimum haben ebenfalls aus der buecherliste entfernen und in die momentane gruppe einfuegen
        
        //Wiederholen, bis buecherliste leer

    }
    
    public boolean loesungErlaubt(){
        //Ist die Anzahl der gruppen hoechstens die Anzahl der dekofiguren+1?
        return false;
    }
    @Override
    public String toString(){
        //schoene Ausgabe der Buecher erzeugen
        String ausgabe="";
        return ausgabe;
    }
}
