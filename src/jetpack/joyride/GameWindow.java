/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jetpack.joyride;

/**
 *
 * @author Keshav
 */
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
 
public class GameWindow extends JFrame{
     
    public GameWindow() {       
         
        JPanel testPanel = new JPanel();        
        testPanel.setPreferredSize(new Dimension(600, 400));
        
        createMenu();
                 
        add(testPanel);
        pack();
         
        setTitle("Jetpack");
        setLocation(10, 10);
        setResizable(false);
         
        setVisible(true);
    }
    private void createMenu() {
         
    JMenuBar menuBar = new JMenuBar();
    this.setJMenuBar(menuBar);
         
    JMenu fileMenu = new JMenu("Einstellungen");
    JMenu gameMenu = new JMenu("Spiel");
    JMenu prefMenu = new JMenu("Shop");
         
    menuBar.add(fileMenu);        
    menuBar.add(gameMenu);        
    menuBar.add(prefMenu);
        
    addFileMenuItems(fileMenu);
}
     
private void addFileMenuItems(JMenu fileMenu) {
         
    JMenuItem quitItem = new JMenuItem("Spiel verlassen");
    fileMenu.add(quitItem);               
}
     
}