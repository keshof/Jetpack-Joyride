/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jetpack.joyride;

// von liste_mit_abschluss_lsg (Mebis)

public class Knoten extends Highscoreliste{
    
    Highscoreliste nachfolger;
    Datenelement inhalt;
    
    public Knoten(Datenelement d) {
     inhalt = d;
     nachfolger = null;
  }
  
  public Knoten(Datenelement d, Highscoreliste h) {
     inhalt = d;
     nachfolger = h;
  }
  
  public Highscoreliste getNachfolger(){
    return nachfolger;
  }
  
  public Datenelement getInhalt(){
    return inhalt;
  }
  
  public void informationAusgeben(){
    inhalt.informationAusgeben();
  }
  
  /**
   * Einfügen am Ende der Liste
   */
  public Knoten hintenEinfuegen(Datenelement dNeu){
          nachfolger=nachfolger.hintenEinfuegen(dNeu);
          return this;
  }
  
  public Highscoreliste endeEntfernen(Datenelement d){
      if(inhalt==d){
          return nachfolger;
       }
       else{
           nachfolger=nachfolger.endeEntfernen(d);
           return this;
        }
  }
  
  /**
   * Gibt den Inhalt des letzten Knotens 
   */
  public Datenelement getEnde(Datenelement d){
       return nachfolger.getEnde(inhalt);
  }
  
  /**
   * Gibt die Anzahl der Knoten hinter dem Knoten
   * einschließlich des aktuellen Knotens
   */
  public int restlaengeGeben(){
       return nachfolger.restlaengeGeben()+1;
  }
    
}
