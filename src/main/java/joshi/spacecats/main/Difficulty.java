package joshi.spacecats.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Difficulty {

    Timer difficulty = new Timer();
    private final PlaySound sound = new PlaySound();
    public static boolean lvlup = false;
    private int timeSinceLastUpdate = 0;
    static File highscoreFile = new File("src/main/resources/highscore.txt");

    public Difficulty() {
        sound.load();

        if (!highscoreFile.exists()) {
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
    }

    public void updateDifficulty() {
        if (Var.inGame) {
            timeSinceLastUpdate++;

            if (timeSinceLastUpdate < 3000) return;

            sound.play(PlaySound.lvlup);

            Var.lvl++;

            if (Var.lvl > Var.highscorenew) {

                Var.highscorenew = Var.lvl;
            }

            lvlup = true;

            difficulty.schedule(new TimerTask() {
                @Override
                public void run() {
                    lvlup = false;
                }
            }, 100);

            Var.rocketspeed[0] = Var.lvl + 5;
            Var.rocketspeed[1] = Var.lvl + 3;
            Var.rocketspeed[2] = Var.lvl + 4;
            Var.rocketspeed[3] = Var.lvl + 3;
            Var.rocketspeed[4] = Var.lvl + 4;
            Var.rocketspeed[5] = Var.lvl + 5;
            Var.rocketspeed[6] = Var.lvl + 3;
            Var.rocketspeed[7] = Var.lvl + 5;
            Var.rocketspeed[8] = Var.lvl + 4;
            Var.rocketspeed[9] = Var.lvl + 5;

            timeSinceLastUpdate = 0;
        }
    }
}
