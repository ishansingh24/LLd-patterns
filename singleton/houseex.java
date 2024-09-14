// House.java
class House {
    private final String foundation;
    private final String walls;
    private final String roof;
    private final int floors;

    // Private constructor to be used by the Builder
    private House(Builder builder) {
        this.foundation = builder.foundation;
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.floors = builder.floors;
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", walls=" + walls + ", roof=" + roof + ", floors=" + floors + "]";
    }

    // Static nested Builder class
    public static class Builder {
        private String foundation;
        private String walls;
        private String roof;
        private int floors;

        // Method to set the foundation
        public Builder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        // Method to set the walls
        public Builder setWalls(String walls) {
            this.walls = walls;
            return this;
        }

        // Method to set the roof
        public Builder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        // Method to set the number of floors
        public Builder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        // Method to build and return the House object
        public House build() {
            return new House(this);
        }
    }
}

// Main.java
public class houseex {
    public static void main(String[] args) {
        // Create a House using the Builder
        House house = new House.Builder()
            .setFoundation("Concrete")
            .setWalls("Brick")
            .setRoof("Shingle")
            .setFloors(2)
            .build();

        // Print the details of the House
        System.out.println(house);
    }
}


