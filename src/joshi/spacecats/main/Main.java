package joshi.spacecats.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import joshi.spacecats.gui.Gui;
import joshi.spacecats.gui.Label;

public class Main {
	
	public static String skin;
	private static PlaySound sound;
	
	static String skinInput;
	
	static File skinFile = new File("rsc/skin.txt");
	
	public static void main(String[] args) {
		
		sound = new PlaySound();
		sound.load();
		
		if (skinFile.exists()) {
			
		} else {
			
			try {
				skinFile.createNewFile();
				
				skinInput = javax.swing.JOptionPane.showInputDialog("Bitte nenne deinen Skin:");
				
				switch(skinInput.toUpperCase()) {
				case "T-REX": skin = "rsc/trex.png";
								break;
				case "LOCKE": skin = "rsc/locke.png";
								break;
				case "FOGL": skin = "rsc/fogl.png";
								break;
				case "LUCY": skin = "rsc/lucy.png";
								break;
				default: skin = "rsc/lucy.png";
						 System.out.println("Es gibt keinen Skin '" + skinInput +"'. Bitte benutze einen anderen.");
						 System.out.println("Möglich sind:");
						 System.out.println("Locke, T-Rex, Lilli, Leni, Lucy");
						 	break;
				}
				
				try {
					
					OutputStream write = new FileOutputStream( skinFile );
					
					try {
						write.write( skin.getBytes() );
						
						write.close();
					} catch (IOException r) {
						r.printStackTrace();
					}
					
					
				} catch (FileNotFoundException s) {
					s.printStackTrace();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		try {
			Scanner sc = new Scanner(skinFile);
			
			skin = sc.next();
			
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		sound.play(PlaySound.start);
		
		new Gui();
		new Var();
		new KeyHandler();
		new Label();
		new Background();
		new PlayerMovement();
		new RocketMovement();
		new FoodMovement();
		new RocketCollision();
		new FoodCollision();
		new Loosed();
		new Update();
		new ActionHandler();
		new Difficulty();
		new Music();
		new HighScoreFile();
	}

}
