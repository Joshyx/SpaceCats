package joshi.spacecats.main;

public class Background {

    public void execute() {
        if (Var.inGame) {
            if (Var.backgroundX1 > -1900) {
                Var.backgroundX1 -= 1;
            } else {
                Var.backgroundX1 = 1920;
            }

            if (Var.backgroundX2 > -1900) {
                Var.backgroundX2 -= 1;
            } else {
                Var.backgroundX2 = 1920;
            }
        }
    }
}
