public class Main {
    
    public static void main() {
        //user start new game so the board is creating
        //a lot of trees are in the board, so create all types of the tree and reuse them

        for(int i=0; i<1000; i++) {
            //random type of the plant and get it from cache factory
            Type type = randomType();
            Details details = DetailsFactory.getTreeType(type);

            //random position of the tree on the board
            Position position = randomPosition();

            //create plant based on the type and position
            //Factory method can be used, but for simplify just if-else
            Plant plant;
            if(type == Type.OAK || type == Type.PINE || Type.CHESTNUT) {
                plant = new Tree(point, data);
            }
            else if(type == Type.ROSE || Type.TULIP || Type.HEATHER) {
                plant = new Flower(point, data);
            }

            //put the plant on the map
            plant.draw();
        }
    }

    public static Position randomPosition(int min, int max) {
        int x = randomValue(100, 100);
        int y = randomValue(100, 100);
        int z = randomValue(20, 20);
        return new Position(x, y, z);
    }

    public static int randomValue(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}