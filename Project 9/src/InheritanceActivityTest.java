public class InheritanceActivityTest {
    public static void main(String[] args) {
        Plant rose = new Plant("Rose", "Red", 10, 0.5);
        System.out.println(rose);

        IndoorPlant peaceLily = new IndoorPlant("Peace Lily", "White", 5, 0.7, "Living Room");
        System.out.println(peaceLily);
        System.out.println("Location: " + peaceLily.getLocation());

        OutdoorPlant sunflower = new OutdoorPlant("Sunflower", "Yellow", 20, 2.0, true);
        System.out.println(sunflower);
        System.out.println("Is perennial: " + sunflower.isPerennial());
    }
}

class Plant {
    protected String name;
    protected String color;
    protected int numOfPetals;
    protected double height;

    public Plant(String name, String color, int numOfPetals, double height) {
        this.name = name;
        this.color = color;
        this.numOfPetals = numOfPetals;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("The Flower: %s Color: %s # of petals: %d Height: %.2f", name, color, numOfPetals, height);
    }
}

class IndoorPlant extends Plant {
    private String location;

    public IndoorPlant(String name, String color, int numOfPetals, double height, String location) {
        super(name, color, numOfPetals, height);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

class OutdoorPlant extends Plant {
    private boolean isPerennial;

    public OutdoorPlant(String name, String color, int numOfPetals, double height, boolean isPerennial) {
        super(name, color, numOfPetals, height);
        this.isPerennial = isPerennial;
    }

    public boolean isPerennial() {
        return isPerennial;
    }

    public void setPerennial(boolean perennial) {
        isPerennial = perennial;
    }
}


