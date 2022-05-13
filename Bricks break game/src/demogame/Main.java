package demogame;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		//creating object for jframe class
		JFrame obj=new JFrame();  
		//creating object for gameplay class
		Gameplay gamePlay = new Gameplay();  
		//setting position and size of frame
		obj.setBounds(10, 10, 700, 600);
		//setting title 
		obj.setTitle("Breakout Ball"); 
		//make the window resize as false
		obj.setResizable(false); 
		//make the frame visible
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);	
	}

}

