import processing.core.PApplet;

public class Main extends PApplet{

	// Create some integer variables
	int x = 250;
	int y = 250;
	
	public void settings(){
		size(500, 500); // set the size of the application window
	}
	
	public void draw(){
		background(255); // apply a background
		
		// draw a shape at the location 
		// represented by the variables x & y 
		// with width & height 100
		ellipse(x, y, 100, 100); 
	}
	
	public static void main(String[] args){
		String[] processingArgs = {"MySketch"};
		Main mySketch = new Main();
		PApplet.runSketch(processingArgs, mySketch);
	}
}