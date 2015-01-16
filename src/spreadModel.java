import java.util.*;
import java.awt.*;
import java.math.*;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class spreadModel {
	/**
	 * Eric Mikulin
	 * For G4 Project
	 */
	public static void main(String[] args) {
		//Declare scanner, for input
		Scanner input = new Scanner(System.in);
	    
	    //Declare the variables for the simulation
		double headSize;
		int headType;
		String wind;
		int terrain;
		
		double[] gammaSpread = new double[1000];
		double[] neutronSpread = new double[1000];
		double[] thermalSpread = new double[1000];
		double[] falloutSpread = new double[1000];
		double[] EMPSpread = new double[1000];
		double[] groundshockSpread = new double[1000];
		double[] overpressureSpread = new double[1000];
		double[][] cratorSpread = new double[1000][1000];
		
		//Gather Information from the user
		System.out.println("Eris TM Nuclear Warhead Spread & Crater Models");
		System.out.println("");
		
		System.out.println("Size of Warhead you wish to be modeled? (in MegaTonnes)");
		headSize = input.nextDouble();
		
		System.out.println("Type of Warhead you wish to be modeled? (1.Fission 2.Fusion 3.Neutron)");
		headType = input.nextInt();
		
		//System.out.println("Wind? (speed, direction)");
		//wind = input.nextLine();
		
		System.out.println("Type of terrain you wish to be modeled? (1.Mountains 2.Plains 3.Hills)");
		terrain = input.nextInt();
		
		//Close the scanner (Memory leak otherwise)
		input.close();
		
		//Start computing the explosion (Move to separate class eventually
		for(int x=0; x<1000; x++){
			double y = x;
			gammaSpread[x] = java.lang.Math.pow(headSize, y);
			System.out.println(gammaSpread[x]);
		}
		
		//This is the code block for setting up the applet window to draw the models
	    JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(0, 0, 1100, 600);
	    window.getContentPane().add(new Window());
	    window.setVisible(true);
	}
}
	
class Window extends JComponent {
  public void paint(Graphics g) {
	int size = 250;
	int border = 10;
	  
    g.drawRect (border, border, size, size);
    g.drawRect (size + 2*border, border, size, size);
    g.drawRect (border, size + 2*border, size, size);
    g.drawRect (size + 2*border, size + 2*border, size, size);
    g.drawRect (2* size + 3*border, border, size, size);
    g.drawRect (2* size + 3*border, size + 2*border, size, size);
    g.drawRect (3* size + 4*border, border, size, size);
    g.drawRect (3* size + 4*border, size + 2*border, size, size);
  }
}