import java.awt.*;

public class Tiger extends Critter {
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else {
            return Action.LEFT;
        }
    }
    public Color getColor() {
        return Color.RED;
    }

    public String toString() {
        return "TGR";
    }
}