package sort;

import java.util.Collection;
import java.util.List;

public class Move {
    private final String description;
    private final int position1;
    private final int position2;
    private final List<Integer> arrayOnStart;

    public Move(List<Integer> arrayOnStart, String description, int position1, int position2) {
        this.arrayOnStart = arrayOnStart;
        this.description = description;
        this.position1 = position1;
        this.position2 = position2;
    }

    public List<Integer> getArrayOnStart() {
        return arrayOnStart;
    }

    public String getDescription() {
        return description;
    }

    public int getPosition1() {
        return position1;
    }

    public int getPosition2() {
        return position2;
    }
}
