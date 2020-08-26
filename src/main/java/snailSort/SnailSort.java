package snailSort;

public class SnailSort {

    public int[] snail(int[][] array) {
        if (array.length == 0 || array[0].length == 0) {
            return new int[0];
        }

        Direction curDir = Direction.RIGHT;
        int[] result = new int[array.length*array.length];
        int leftLimit = 0;
        int rightLimit = array.length - 1;
        int topLimit = 0;
        int bottomLimit = array.length - 1;
        int hIndex = 0;
        int vIndex = 0;

        for(int k = 0; k < Math.pow(array.length, 2); k++) {
            result[k] = array[vIndex][hIndex];
            if (curDir.equals(Direction.UP)) {
                if (--vIndex == topLimit) {
                    curDir = Direction.RIGHT;
                    leftLimit++;
                }
            } else if (curDir.equals(Direction.DOWN)) {
                if (++vIndex == bottomLimit) {
                    curDir = Direction.LEFT;
                    rightLimit--;
                }
            } else if (curDir.equals(Direction.LEFT)) {
                if (--hIndex == leftLimit) {
                    curDir = Direction.UP;
                    bottomLimit--;
                }
            } else if (curDir.equals(Direction.RIGHT)) {
                if (++hIndex == rightLimit) {
                    curDir = Direction.DOWN;
                    topLimit++;
                }
            }
        }
        return result;
    }

    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
