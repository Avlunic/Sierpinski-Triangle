import java.util.ArrayList;
import javax.swing.*;

//Finalized on 12/8/2022
public class SierpinskiTriangle extends Thread{
	
	ArrayList<Integer> xCoordinate = new ArrayList<Integer>();
	ArrayList<Integer> yCoordinate = new ArrayList<Integer>();
	
	//Runs the entire process
	public static void main(String[] args) throws InterruptedException {
		JFrame F = new JFrame();
		theTriangle P = new theTriangle();
	    F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    F.setTitle("Sierpinski Triangle");
	    F.add(P);
	    F.setSize(1000, 1000);
	    F.setLocationRelativeTo(null);
	    F.setVisible(true);
	    
	    //Repaints the triangle slowly 10 times
	    for (int i = 0; i < 10; i++) {
	    	
	    	P.triangleMath(1000);
	    	P.repaint();
		    Thread.sleep(1000);
	    	
	    } 
	    
	    //Finished the triangle quickly
    	P.triangleMath(1000000);
    	P.repaint();
	    
	}
	
}
