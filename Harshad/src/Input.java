import java.util.Scanner;

public class Input {
    public int getZahl (){
        Scanner scan = new Scanner(System.in);
        int zahl=0;
        try{
            System.out.println("Zahl eingeben: ");
            zahl = Integer.parseInt(scan.nextLine());
        }catch (Exception e){
            System.err.println("Keine Zahl!");
        }
        return zahl;
    }

    public boolean getList(int zahl) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-Liste aller Harshad-Zahlen bis "+zahl+"? (y/n)");
        String input = scan.next();
        if (input.equals("y")) {
            System.out.println();
            return true;
        } else System.out.println();
        return false;
    }
}
