package sort;


import java.util.*;

public class BubbleSort {
    public static List<Move> sort(List<Integer> toSort) {
        List<Move> moves = new LinkedList<>();

        boolean sorted = false;

        while (!sorted) {
            // reset value of sorted
            sorted = true;

            // we are checking for 2 integers, so size - 1
            for (int i = 0; i < toSort.size() - 1; i++) {
                List<Integer> arrayOnStart = new ArrayList<>(toSort);

                Integer left = arrayOnStart.get(i);
                Integer right = arrayOnStart.get(i + 1);
                if(left.compareTo(right) > 0) {
                    sorted = false;
                    String description = String.format("Swapping values at positions %d and %d, values %d and %d", i, i+1, left, right);
                    toSort.set(i, right);
                    toSort.set(i+1, left);
                    moves.add(new Move(arrayOnStart, description, i, i+1));
                } else {
                    String description = String.format("Values in positions %d and %d are already sorted, moving on.", i, i+1);
                    moves.add(new Move(arrayOnStart, description, i, i+1));
                }
            }
        }
        moves.add(new Move( toSort,"Sorting done!", -1, -1));

        return moves;
    }
}
