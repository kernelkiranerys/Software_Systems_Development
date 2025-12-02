package Week4;

public class Menu {
    void displayMenuOptions(int opt){
        switch (opt){
            case 1:
                System.out.println("You selected option 1");
                break;
            case 2:
                System.out.println("You selected option 2");
                break;
            case 3:
                System.out.println("You selected option 3");
                break;
            default:
                try {
                    throw new InvalidOptionException("Invalid menu option selected: " + opt);
                } catch (InvalidOptionException e) {
                    System.out.println(e.getMessage());
                }
        }
    }
}
