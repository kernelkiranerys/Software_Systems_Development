package Week4;


public class Driver {
    public static void main(String[] args) {
        ArrayProcessor ap = new ArrayProcessor();

        int len = ap.getArrayLength(new String[]{"one", "two", "three"});
        System.out.println("Length of array: " + len);

        Menu menu = new Menu();
        try {
            menu.displayMenuOptions(1);
            menu.displayMenuOptions(2);
            menu.displayMenuOptions(3);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
