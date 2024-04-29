import java.util.Scanner;

public class food {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in) ;
            String vegetarian,vegan, gluten;

            System.out.println("Is there anyone in your party that is vegetarian?");
            vegetarian =scanner.nextLine();
            System.out.println(" Is there anyone in your party that is vegan?");
            vegan = scanner.nextLine();
        System.out.println(" Is there anyone in your party that is gluten-free?");
            gluten =scanner.nextLine();

            if(vegetarian.equals("no") && vegan.equals("no") && gluten.equals("yes")){
                System.out.println("your options are Main Street Pizza Company, Corner Cafe, and The Chef's Kitchen");
            }
            else if(vegetarian.equals("no") && vegan.equals("yes") && gluten.equals("no")){
                System.out.println("your options are Corner Cafe and The Chef's Kitchen");
            }

            else if(vegetarian.equals("yes") && vegan.equals("no") && gluten.equals("no")){
                System.out.println("your options are Main Street Pizza Company, Corner Cafe, Mama's Fine Italian, and The Chef's Kitchen");
            }

            else if(vegetarian.equals("yes") && vegan.equals("yes") && gluten.equals("no")){
                System.out.println("your options are Main Street Pizza Company, Corner Cafe, Mama's Fine Italian, and The Chef's Kitchen");
            }

            else if(vegetarian.equals("no") && vegan.equals("yes") && gluten.equals("yes")){
                System.out.println("your options are Corner Cafe and The Chef's Kitchen, and Main Street Pizza Company ");
            }

            else if(vegetarian.equals("yes") && vegan.equals("no") && gluten.equals("yes")){
                System.out.println("your options are  Main Street Pizza Company, Corner Cafe, Mama's Fine Italian, and The Chef's Kitchen");
            }

            else{
                    System.out.println("you can eat anywhere!");
                }




    }
}
