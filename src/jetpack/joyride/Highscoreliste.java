/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jetpack.joyride;

// von liste_mit_abschluss_lsg (Mebis)

public abstract class Highscoreliste{
    
    public abstract Highscoreliste getNachfolger();
    
    public abstract void informationAusgeben();
    
    public abstract Datenelement getInhalt();

    public abstract Highscoreliste hintenEinfuegen(Datenelement dNeu);
    
    public abstract Highscoreliste endeEntfernen(Datenelement d);
    
    public abstract Datenelement getEnde(Datenelement d);

    public abstract int restlaengeGeben();
    
    

}
