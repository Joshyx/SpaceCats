package joshi.spacecats.main;

import java.util.Timer;
import java.util.TimerTask;

public class RocketCollision {

    private final PlaySound sound = new PlaySound();

    private int temp = 0;
    public static boolean hit = false;

    public RocketCollision() {
        sound.load();
    }

    public void execute() {
        for (int i = 0; i <= 4; i++) {
            if (temp >= 1 && temp <= 65) {
                temp++;
                continue;
            } else if (temp == 66) {
                temp = 0;
                continue;
            }

            if (!(Var.x >= Var.rocketX[i] - 150 && Var.x <= Var.rocketX[i] + 200 && Var.y >= Var.rocketY[i] - 100 && Var.y <= Var.rocketY[i])) {
                continue;
            }

            Var.collisioned = true;

            if (Var.health >= 1) {

                sound.play(PlaySound.hurt);

                Var.health--;

                hit = true;

                new Timer().schedule(new TimerTask() {

                    @Override
                    public void run() {
                        hit = false;
                    }
                }, 100);
            } else if (Var.health == 0) {
                Var.lost = true;
                Var.inDeathScreen = true;
                KeyHandler.tempKeyHandler++;
                Var.inGame = false;
            } else {
                Var.lost = false;

                Var.rocketX[i] = 2020;
            }

            temp++;
        }
    }
}
