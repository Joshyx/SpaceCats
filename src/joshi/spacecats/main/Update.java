package joshi.spacecats.main;

import java.util.Timer;
import java.util.TimerTask;

public class Update {
	
	Timer update;
	public static int tempUpdate = 0;

	public Update() {
		
		update = new Timer();
		update.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if (Var.inMenu) {
					if (tempUpdate == 0) {
						Var.btnresume.requestFocus();
						Var.btnoptions.requestFocus();
						Var.btnshop.requestFocus();
						Var.btnexit.requestFocus();
						Var.btncredits.requestFocus();
						tempUpdate++;
					} else if (tempUpdate == 1) {
						Var.jf1.requestFocus();
					}
				}
				
			}
		}, 0, 15);
		
	}

}
