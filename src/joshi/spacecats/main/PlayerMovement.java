package joshi.spacecats.main;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
	
	Timer movement;

	public PlayerMovement() {
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if(Var.inGame) {
				if(Var.moveup == true) {
					if (Var.y > 0) {
						Var.y -= Var.speedup;
					}
				}
				if(Var.movedown == true) {
					if (Var.y < 915) {
						Var.y += Var.speeddown;
					}
				}
				if(Var.moveleft == true) {
					if (Var.x > 0) {
						Var.x -= Var.speedleft;
					}
				}
				if(Var.moveright == true) {
					if (Var.x < 1720) {
						Var.x += Var.speedright;
					}
				}
			}
			}
		}, 0, 10);
		
	}

}
