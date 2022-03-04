/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jetpack.joyride;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
 
 
public class SPIEL extends JPanel{
 
  public static final String IMAGE_DIR = "hintergrund/";
     
  private final Dimension prefSize = new Dimension(1180, 1180);
     
  private ImageIcon backgroundImage;
  private final String[] backgroundImages= new String [] {"index.jpg"};
     
  private boolean gameOver = false;
  private int strecke;
  
     
  private Timer t;  
     
     
  public SPIEL() {        
    setFocusable(true);
    setPreferredSize(prefSize);
         
    initGame();         
    startGame();
  }
     
     
  public boolean isGameOver() {
    return gameOver;
  }
 
  public void setGameOver(boolean gameOver) {
    this.gameOver = gameOver;
  }
     
  private void initGame () {
    setBackgroundImage(0);
    createGameObjects();
        
    t = new Timer(20, new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
          doOnTick();     
       }
    });
  }
     
  private void createGameObjects() {
    // Spielobjekte erzeugen
  } 
     
  
  
     
  public void setBackgroundImage(int imageNumber) {
    String imagePath = IMAGE_DIR + backgroundImages[imageNumber];
    URL imageURL = getClass().getResource(imagePath);        
    backgroundImage = new ImageIcon(imageURL);
  }
     
  private void startGame() {
    t.start();
  }
     
  public void pauseGame() {
    t.stop();
  }
     
  public void continueGame() {
    if (!isGameOver()) t.start();
  }
     
  public void restartGame() {
    strecke = 0;
    setGameOver(false);
    createGameObjects();
    startGame();
  }
     
  private void endGame() { 
    setGameOver(true);
    pauseGame();
  }
     
  private void doOnTick() {
      strecke++;
      if (strecke > 1000) endGame();
      repaint();
    
         
    
  }
     
  @Override
  public void paintComponent (Graphics g) {
    super.paintComponent(g);
         
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
    backgroundImage.paintIcon(null, g, 0, 0); 
                 
    g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 19));            
    g.setColor(Color.BLUE);
    g.drawString("Gelaufene Meter: " + strecke, 22, prefSize.height-5);        
                 
    if (isGameOver()) {
       g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 50));
       g.setColor(Color.RED);
       g.drawString("Spiel vorbei!", prefSize.width/2 - 130, prefSize.height/5);
    }
  }
     
}