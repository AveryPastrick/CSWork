import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println(" Enter a number 1-3 for a planet name and info of what its made of");
        int planetNumber = Integer.parseInt(console.nextLine());
        String planetName;

        switch (planetNumber)
        {
            case 1:
                planetName = "Earth is mostly water";
                System.out.println(planetName);
                break;

            case 2:
                planetName = "Venus is made of iron and rocky mantle ";
                System.out.println(planetName);
                break;

            case 3:
                planetName = "Uranus is made of water, methane, and ammonia ";
                System.out.println(planetName);
                break;

            default:
                planetName = "Invalid number";
                System.out.println(planetName);
                break;
        }
        console.close();
    }
}
