import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu();
    }
}
class Move {
    private String moveName;
    private int movePower;
    private int moveSpeed;
    public Move(String moveName, int movePower, int moveSpeed){
        this.moveName = moveName;
        this.movePower = movePower;
        this.moveSpeed = moveSpeed;
    }
    public String getMoveName() {
        return moveName;
    }
    public int getMovePower() {
        return movePower;
    }
    public int getMoveSpeed() {
        return moveSpeed;
    }
    @Override
    public String toString() {
        return String.format("Move: %s\nPower: %d\nSpeed: %d\n", moveName, movePower, moveSpeed);
    }
}

class Pokemon {
    private String name;
    private int hp;
    private ArrayList<Move> moveArrayList = new ArrayList<>();
    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public ArrayList<Move> getMoveArrayList() {
        return moveArrayList;
    }
    public void addMove(Move move) {
        moveArrayList.add(move);
    }
    public void removeMove(Move move) {
        moveArrayList.remove(move);
    }
    public Move getMove(String moveName) {
        Move foundMove = null;
        for(Move move: moveArrayList) {
            if(move.getMoveName().equals(moveName)) {
                foundMove = move;
                break;
            }
        }
        return foundMove;
    }
    @Override
    public String toString() {
        return String.format("Name: %s\nHP: %d\n", name, hp);
    }
}
class Pokedex {
    private ArrayList<Pokemon> pokemonArrayList = new ArrayList<>();
    public void addPokemon(Pokemon pokemon) {
        pokemonArrayList.add(pokemon);
    }
    public void removePokemon(Pokemon pokemon) {
        pokemonArrayList.remove(pokemon);
    }
    public ArrayList<Pokemon> getPokemonArrayList() {
        return pokemonArrayList;
    }
    public Pokemon getPokemon(String pokemonName) {
        Pokemon foundPokemon = null;
        for(Pokemon pokemon : pokemonArrayList) {
            if(pokemon.getName().equals(pokemonName)) {
                foundPokemon = pokemon;
                break;
            }
        }
        return foundPokemon;
    }
}
class Menu {
    private Scanner scanner;
    private Pokedex pokedex;

    public Menu() {
        scanner = new Scanner(System.in);
        pokedex = new Pokedex();
    }
    public void displayMenu() {
        int choice = 0;
        while (choice != 5) {
            System.out.println("***** MENU *****");
            System.out.println("1: Create Pokemon");
            System.out.println("2: Delete Pokemon");
            System.out.println("3: Display Pokemon");
            System.out.println("4: Display All Pokemon");
            System.out.println("5: Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createPokemon();
                    break;
                case 2:
                    deletePokemon();
                    break;
                case 3:
                    displayPokemon();
                    break;
                case 4:
                    displayAllPokemon();
                    break;
                case 5:
                    System.out.println("Exiting menu...");
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    private void createPokemon() {
        System.out.print("Enter Pokemon name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Pokemon hp: ");
        int hp = scanner.nextInt();
        scanner.nextLine();

        Pokemon pokemon = new Pokemon(name, hp);

        String moveName;
        while (true) {
            System.out.print("Enter move name (or 'q' to finish): ");
            moveName = scanner.nextLine();
            if (moveName.equals("q")) {
                break;
            }
            System.out.print("Enter move power: ");
            int power = scanner.nextInt();
            System.out.print("Enter move speed: ");
            int speed = scanner.nextInt();
            scanner.nextLine();

            Move move = new Move(moveName, power, speed);
            pokemon.addMove(move);
        }

        pokedex.addPokemon(pokemon);
        System.out.println("Pokemon has been added to the Pokedex.");
    }
    private void deletePokemon() {
        System.out.print("Enter the name of the Pokemon to delete: ");
        String name = scanner.nextLine();
        Pokemon pokemonToDelete = pokedex.getPokemon(name);
        if (pokemonToDelete == null) {
            System.out.println("Pokemon not found.");
        } else {
            pokedex.removePokemon(pokemonToDelete);
            System.out.println("Pokemon deleted.");
        }
    }
    private void displayPokemon() {
        System.out.print("Enter the name of the Pokemon to display info: ");
        String name = scanner.nextLine();
        Pokemon pokemon = pokedex.getPokemon(name);
        if (pokemon == null) {
            System.out.println("Pokemon not found.");
        } else {
            System.out.println("Pokemon Info:");
            System.out.println(pokemon);
            System.out.println("Moves:");
            for (Move move : pokemon.getMoveArrayList()) {
                System.out.println(move);
            }
        }
    }
    private void displayAllPokemon() {
        ArrayList<Pokemon> allPokemon = pokedex.getPokemonArrayList();
        System.out.println("All Pokemon:");
        for (Pokemon pokemon : allPokemon) {
            System.out.println(pokemon);
        }
    }
}


