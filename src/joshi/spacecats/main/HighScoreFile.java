package joshi.spacecats.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class HighScoreFile {
	
	static File highscoreFile = new File("rsc/highscore.txt");
	
	Timer timer = new Timer();
	
	public HighScoreFile() {
		
		if (highscoreFile.exists()) {
			
		} else {
			
			try {
				highscoreFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		try {
			Scanner sc = new Scanner(highscoreFile);
			
			Var.highscoreold = sc.nextInt();
			Var.highscorenew = Var.highscoreold;
			
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if ( Var.lvl > Var.highscorenew ) {
					
					Var.highscorenew = Var.lvl;
					
				}
				
			}
		}, 0, 15);
		
	}

}
