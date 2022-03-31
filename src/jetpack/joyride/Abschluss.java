/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jetpack.joyride;

// von liste_mit_abschluss_lsg (Mebis)

public class Abschluss extends Highscoreliste {
    
    public Highscoreliste getNachfolger(){
        return this;
    }
    
    public Datenelement getInhalt(){
    return null;
  }
  
  public void informationAusgeben(){
    System.out.println("Abschluss");
  }
  
  public Knoten hintenEinfuegen(Datenelement dNeu){
          Knoten kneu;
          kneu = new Knoten(dNeu, this);
          return kneu;
  }
  
  /**
   * zum Entfernen des letzten Listenelements 
   */
  public Highscoreliste endeEntfernen(Datenelement d){
      return this;
  } 
  public Datenelement getEnde(Datenelement d){
    return d;
  }
  
  /**
   * Gibt die Anzahl der Knoten hinter dem Knoten einschließlich des aktuellen Knotens
   */
  public int restlaengeGeben(){
     return 0;
    }
    
}
