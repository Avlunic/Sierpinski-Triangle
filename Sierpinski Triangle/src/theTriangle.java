import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class theTriangle extends JPanel{

	private static final long serialVersionUID = 1L;
	
	ArrayList<Integer> xCoordinate = new ArrayList<Integer>(Arrays.asList(0, 1000, 500, 100));
	ArrayList<Integer> yCoordinate = new ArrayList<Integer>(Arrays.asList(0, 0, 1000, 0));
	
	//Initializes the triangle
	public void theTraingle() {

	}
	
	//Adds a new triangle point completely randomly
	public void triangleMath(int x) {
		
		for (int i = 0; i < x; i++) {
		
			int Random = (int)(30 * Math.random());
		
			if (Random < 10) {
				xCoordinate.add((xCoordinate.get(xCoordinate.size() - 1) + 0) / 2);
				yCoordinate.add((yCoordinate.get(yCoordinate.size() - 1) + 0) / 2);
			}
		
			else if (Random < 20) {
				xCoordinate.add((xCoordinate.get(xCoordinate.size() - 1) + 1000) / 2);
				yCoordinate.add((yCoordinate.get(yCoordinate.size() - 1) + 0) / 2);
			}
		
			else {
				xCoordinate.add((xCoordinate.get(xCoordinate.size() - 1) + 500) / 2);
				yCoordinate.add((yCoordinate.get(yCoordinate.size() - 1) + 1000) / 2);
			}
			
		
		}
		
		
	}
	
	//Paints the dots to form the Sierpinski Triangle
	@Override
	public void paintComponent(Graphics g) {
		
		g.setColor(new Color(100, 0, 0));
		
		for ( int i = 0; i < xCoordinate.size(); i++) {
			
			g.fillOval(xCoordinate.get(i), 1000 - yCoordinate.get(i), 2, 2);
			
		}
		
	}
	
}
