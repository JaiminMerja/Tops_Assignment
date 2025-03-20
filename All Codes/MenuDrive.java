public class MenuDrive {
    public static void main(String[] args) {
        int choice = 2; 
        switch (choice) {
            case 1:
                System.out.println("Option 1: Displaying Hello World!");
                break;
            case 2:
                System.out.println("Option 2: Performing Addition: 5 + 3 = " + (5 + 3));
                break;
            case 3:
                System.out.println("Option 3: Showing current year: 2025");
                break;
            default:
                System.out.println("Invalid Option Selected");
        }
    }
}

