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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
public class GameWindow extends JFrame{
    
    private final SPIEL jetSpiel;
     
    public GameWindow() {   
         
        this.jetSpiel = new SPIEL();
                 
        registerWindowListener();
        createMenu();
           
        add(jetSpiel);
        pack();
         
        setTitle("Jetpack Joyride");
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
    addGameMenuItems(gameMenu);
}
     
private void addFileMenuItems(JMenu fileMenu) {
         
    JMenuItem quitItem = new JMenuItem("Spiel verlassen");
    fileMenu.add(quitItem);  
    quitItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }); 
}

private void registerWindowListener() {        
    addWindowListener(new WindowAdapter() {            
        @Override
        public void windowClosing(WindowEvent e) { 
            System.exit(0); 
        }
        @Override
        public void windowDeactivated(WindowEvent e) {
            // Pause
            jetSpiel.pauseGame();
        }
        @Override
        public void windowActivated(WindowEvent e) {
            // Fortsetzen
            jetSpiel.continueGame();
        }            
    });        
}

private void addGameMenuItems(JMenu gameMenu) {
    JMenuItem pauseItem = new JMenuItem("Pause");
    gameMenu.add(pauseItem);        
    pauseItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            jetSpiel.pauseGame();
        }
    });
         
    JMenuItem continuetItem = new JMenuItem("Fortsetzen");
    gameMenu.add(continuetItem);       
    continuetItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {                
            jetSpiel.continueGame();
        }
    });
         
    gameMenu.addSeparator();
    JMenuItem restartItem = new JMenuItem("Neustart");
    gameMenu.add(restartItem);       
    restartItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {                
            jetSpiel.restartGame();
        }
    });
}
     
}