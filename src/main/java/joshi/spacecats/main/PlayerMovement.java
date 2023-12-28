package joshi.spacecats.main;

public class PlayerMovement {

    public void execute() {
        if (Var.inGame) {
            if (Var.moveup) {
                if (Var.y > 0) {
                    Var.y -= Var.speedup;
                }
            }
            if (Var.movedown) {
                if (Var.y < 915) {
                    Var.y += Var.speeddown;
                }
            }
            if (Var.moveleft) {
                if (Var.x > 0) {
                    Var.x -= Var.speedleft;
                }
            }
            if (Var.moveright) {
                if (Var.x < 1720) {
                    Var.x += Var.speedright;
                }
            }
        }
    }
}
