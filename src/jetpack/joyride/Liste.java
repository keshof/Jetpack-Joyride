/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jetpack.joyride;

public class Liste
{
    /** Verwaltung des ersten Knoten in der Liste. */
    Highscoreliste anfang;
    
   
     /**
     * Konstruktor der Liste
     * 
     */
    public Liste()
    {
        anfang = new Abschluss();
            
    }
    
    
  
    
     /**
     * Fügt ein neues Objekt am Ende der Liste ein.
     */
    public void hintenEinfuegen(Datenelement dNeu){
        
        anfang=anfang.hintenEinfuegen(dNeu);  
            
    }
    
     
 
    
    
     /**
     * Entfernt das erste Objekt aus der Liste und gibt es aus.
     * @return bisheriger erstes Objekt 
     */
    public Datenelement anfangEntfernen(){
            Highscoreliste l = anfang;
            anfang = anfang.getNachfolger();
            return l.getInhalt();   
        }
       
    
    /**
     * Entfernt das letzte Objekt aus der Liste und gibt es aus.
     * @return bisheriges letztes Objekt 
     */
    public Datenelement endeEntfernen(){
            Datenelement d;
            d = anfang.getEnde(null); 
            anfang = anfang.endeEntfernen(d);
            return d;   
    }
    
   public Datenelement endeGeben(){
            Datenelement ende;
            ende = anfang.getEnde(null); 
            return ende;   
    }
    
     
    /**
     * Bestimmt die Laenge der Liste
     */
    
    public int laengeGeben(){
        return anfang.restlaengeGeben();
    }
    /**
     * Gibt Information die gesamte Liste aus.
     */
    
    
    void alleInformationenAusgeben(){
      Highscoreliste aktuell = anfang;
           do{
                aktuell.informationAusgeben();
                aktuell = aktuell.getNachfolger();
           }
            while (aktuell.getInhalt()!=null);
            System.out.println(); 
            
    } 
    
}