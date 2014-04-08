package org.lotus;

import java.awt.Frame;
import java.awt.EventQueue;
import java.awt.Button;
import java.awt.BorderLayout;

public class Launch {

    public static void main(String[] args) {

		Runnable work = new Runnable() {
			@Override
			public void run() {
				Frame f = new Frame("My AWT Frame"); //set title
				f.setLocationRelativeTo(null); //put in center of screen
                //first param is component, second param is region
                f.add(new Button("North"), BorderLayout.NORTH); // add button to frame
                f.add(new Button("West"), BorderLayout.WEST); // add button to frame
                f.add(new Button("East"), BorderLayout.EAST); // add button to frame
                f.add(new Button("South"), BorderLayout.SOUTH); // add button to frame
                f.add(new Button("Center")); // add button to frame in center, u may  use BorderLayout.CENTER
                f.pack(); // set auto width and height
				f.setVisible(true); //show to the user
			}
		};

		// create thread for this work(optional but recommended)
		EventQueue.invokeLater(work);
    }
}
