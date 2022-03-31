/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jetpack.joyride;

public class EINTRAG implements Datenelement
{
    String name;
    int distanz;
    
    public EINTRAG(String nameNeu, int distanzNeu)
    {
        name = nameNeu;
        distanz = distanzNeu;
    }
    
    public int getDistanz()
    {
        return distanz;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void informationAusgeben()
    {
        System.out.println(name + " ");
        System.out.println(distanz + " ");
    }
    
    public boolean istKleinerAls(Datenelement d){
        EINTRAG e = (EINTRAG)d;
        return (name.compareTo(e.getName())<0);
    }
    
    public boolean schluesselIstGleich(String s){
        return name.equals(s);
    }
}
  
