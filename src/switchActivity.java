import java.util.Scanner;

public class switchActivity {
    public static void main(String[] args) {
        String house;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a house at hogwarts. (Capital letter to start");
        house = scanner.nextLine();
        switch (house) {
            case "Gryffindor":
                System.out.print("Their animal is the Lion." + "\n" + "Their colors are red and gold." + "\n" + "Founded by Godric Gryffindor");
                break;
            case "Hufflepuff":
                System.out.print("Their animal is the Badger." + "\n" + "Their colors are yellow and black." + "\n" + "Founded by Helga Hufflepuff");
                break;
            case "Ravenclaw":
                System.out.print("Their animal is the Eagles." + "\n" + "Their colors are blue and bronze." + "\n" + "Founded by Rowena Ravenclaw");
                break;
            case "Slytherin":
                System.out.print("Their animal is the Serpent." + "\n" + "Their colors are green and silver." + "\n" + "Founded by Salazar Slytherin");

        }


        }

    }


