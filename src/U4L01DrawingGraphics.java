import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class U4L01DrawingGraphics extends JFrame {
	public U4L01DrawingGraphics(){
        initGUI();
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        int WIDTH = 300;
        int HEIGHT = 300;
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	
	 private void initGUI(){
	       
	        
	        //drawing panel
	        DrawingPanel dp = new DrawingPanel();
	        add(dp, BorderLayout.CENTER);
	 }
	
	public static void main(String[] args) {
        try {
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch ( Exception e) {}
        
        EventQueue.invokeLater(new Runnable (){
            @Override
            public void run() {
                new U4L01DrawingGraphics();
            }   
        });
    }
}
