import java.util.*;
public class icecreamlist {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList <icecream> arr_list = new ArrayList <icecream>();

        while(true)
        {
            System.out.println("Enter 1 to create object\n "
                    + "Enter 0 to exit");

            int choice = scan.nextInt();
            if (choice == 1) {
                icecream obj = new icecream();
                System.out.println("Company name");
                String com = scan.next();
                System.out.println("Type Name");
                String type = scan.next();
                System.out.println("Cream price");
                double price = scan.nextInt();
                obj.setIcecreamCom(com);
                obj.setIcecreamType(type);
                obj.setIcecreamPrice(price);

                arr_list.add(obj);
            }
            else
                break;
        }
        System.out.println("Printing Obejects which prices are greater than \n");
        for (icecream iceCream : arr_list) {
            if (iceCream.getIcecreamPrice() >= 250) {
                System.out.println(iceCream);
            }
    }
}}
