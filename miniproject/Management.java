package miniproject;


import java.util.Scanner;

public class Management {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Customer details
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone: ");
        long phone = sc.nextLong();

        sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        // Object creation
        Hotel h = new Hotel(name, phone, location);

        int menu;
        int quantity;
        int price = 0;
        int total;
        int grandTotal = 0;

        double discount;
        double finalAmount;

        char choice = 'Y';

        // Food ordering
        while (choice == 'Y' || choice == 'y') {

            System.out.println("\n===== FOOD MENU =====");
            System.out.println("1. Chicken Biriyani - Rs.100");
            System.out.println("2. Mutton Biriyani - Rs.290");
            System.out.println("3. Parotta - Rs.70");
            System.out.println("4. Chilli Chicken - Rs.100");
            System.out.println("5. Chicken Rice - Rs.100");
            System.out.println("6. Tandoori Half - Rs.300");

            System.out.print("Select Food: ");
            menu = sc.nextInt();

            switch (menu) {

                case 1:
                    System.out.println("Chicken Biriyani - Rs.100");
                    price = 100;
                    break;

                case 2:
                    System.out.println("Mutton Biriyani - Rs.290");
                    price = 290;
                    break;

                case 3:
                    System.out.println("Parotta - Rs.70");
                    price = 70;
                    break;

                case 4:
                    System.out.println("Chilli Chicken - Rs.100");
                    price = 100;
                    break;

                case 5:
                    System.out.println("Chicken Rice - Rs.100");
                    price = 100;
                    break;

                case 6:
                    System.out.println("Tandoori Half - Rs.300");
                    price = 300;
                    break;

                default:
                    System.out.println("Invalid Food Choice");
                    continue;
            }

            System.out.print("Enter Quantity: ");
            quantity = sc.nextInt();

            total = price * quantity;

            grandTotal = grandTotal + total;

            System.out.println("Total Amount = Rs." + total);

            System.out.print("Do you want to add more food? (Y/N): ");
            choice = sc.next().charAt(0);
        }

        // Discount
        if (grandTotal >= 500) {

            discount = grandTotal * 10 / 100;
            finalAmount = grandTotal - discount;

            System.out.println("\n===== DISCOUNT =====");
            System.out.println("Discount = Rs." + discount);
            System.out.println("Final Amount = Rs." + finalAmount);

        } else {

            discount = 0;
            finalAmount = grandTotal;

            System.out.println("\nNo Discount");
            System.out.println("Final Amount = Rs." + finalAmount);
        }

        // Bill
        System.out.println("\n===== FINAL BILL =====");
        System.out.println("Name     : " + h.getname());
        System.out.println("Phone    : " + h.getphone());
        System.out.println("Location : " + h.getlocation());
        System.out.println("Total    : Rs." + grandTotal);
        System.out.println("Discount : Rs." + discount);
        System.out.println("Payable  : Rs." + finalAmount);

        // Order confirmation
        System.out.print("\nConfirm Order? (Y/N): ");
        char confirm = sc.next().charAt(0);

        if (confirm == 'Y' || confirm == 'y') {
            System.out.println("Order Confirmed Successfully!");
        } else {
            System.out.println("Order Cancelled.");
        }

        System.out.println("Thank You!");
    }
}


