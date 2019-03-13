import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	public DrawingPanel() {
		setBackground(Color.CYAN);
		
	}
	
	public void paintComponent(Graphics g) {
		/*//g.setColor(Color.MAGENTA);
		//g.drawString("This is a string", 200, 250);
		
		//eyes
		g.setColor(Color.BLUE);
		g.drawLine(100, 100, 100, 150);
		g.drawLine(150, 100, 150, 150);
		
		//mouth
		//g.fillArc(100, 75, 50, 90, 180);
		//Picture an oval with upper left corner of the screen
		//100, 75, and its 50 wide and 50 high
		g.setColor(Color.RED);
		g.fillArc(100, 200, 50, 50, 180, 180);
		
		g.setColor(Color.RED);*/
		
		
		int initialSpotX = 50;
		int initialSpotY = 50;
		for(int i = 0; i < 10; i++) {
			Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(3));
            initialSpotX++;
            initialSpotY++;
            Font titleFont = new  Font ("Harlow Solid Italic", Font.BOLD, 40);
    		g.setFont(titleFont);
            g.drawString("LCW", 90, 150);
            g.setColor(new Color(255, 0, 164));
			g.drawOval(initialSpotX, initialSpotY, 180, 180);
			initialSpotX = resetSpot(initialSpotX);
			initialSpotY = resetSpot(initialSpotY);
			
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(Color.BLACK);
			Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(3));
			initialSpotX += 10;
			g.drawOval(initialSpotX, initialSpotY, 180, 180);
			initialSpotX = resetSpot(initialSpotX);
			initialSpotY = resetSpot(initialSpotY);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(Color.BLACK);
			Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(3));
			initialSpotX -= 10;
			g.drawOval(initialSpotX, initialSpotY, 180, 180);
			initialSpotX = resetSpot(initialSpotX);
			initialSpotY = resetSpot(initialSpotY);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(Color.BLACK);
			Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(3));
			initialSpotY += 10;
			g.drawOval(initialSpotX, initialSpotY, 180, 180);
			initialSpotX = resetSpot(initialSpotX);
			initialSpotY = resetSpot(initialSpotY);
		}
		for(int i = 0; i < 10; i++) {
			g.setColor(Color.BLACK);
			Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(3));
			initialSpotY -= 10;
			g.drawOval(initialSpotX, initialSpotY, 180, 180);
			initialSpotX = resetSpot(initialSpotX);
			initialSpotY = resetSpot(initialSpotY);
		}
		
		
	}
	private static int resetSpot(int spot) {
		spot = 50;
		return spot;
	}

	public Dimension getPreferredSize() {
		return new Dimension(500, 500);
	}
}
