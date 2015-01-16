import java.util.*;
import java.awt.*;
import java.math.*;
import javax.swing.*;

public class spreadModel{
	private static final long serialVersionUID = 1L;
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
		double range;
		double resolution;
		
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
		
		System.out.println("What range do you want modeled (in km)");
		range = input.nextDouble();
		
		System.out.println("What resolution do you want modeled? (points per meter");
		resolution = input.nextDouble();
		
		int memUse = (int) (resolution * 1000 * range);
		
		double[] gammaSpread = new double[memUse];
		double[] neutronSpread = new double[memUse];
		double[] thermalSpread = new double[memUse];
		double[] falloutSpread = new double[memUse];
		double[] EMPSpread = new double[memUse];
		double[] groundshockSpread = new double[memUse];
		double[] overpressureSpread = new double[memUse];
		double[][] cratorSpread = new double[memUse][memUse];
		
		//Close the scanner (Memory leak otherwise)
		input.close();
		
		for(int x=0; x<1000; x++){
		}
		
		frame();
	}
	
	//Drawing up the frames and stuff
	  private static void frame() {
		  int width = 800;
		  int height = 450;
		  JFrame aWindow = new JFrame("Explosion Spread Model");
		  int windowWidth = width;           // Window width in pixels
		  int windowHeight = height;          // Window height in pixels
		  aWindow.setBounds(50, 100,       // Set position
		  windowWidth, windowHeight);  // and size
		  aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  aWindow.setVisible(true);        // Display the window
		 }
}