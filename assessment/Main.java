package assessment;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Create loyalty clubs
        LoyaltyClub standardClub = new StandardLoyaltyClub();
        LoyaltyClub premiumClub = new PremiumLoyaltyClub();

        // Create customers
        Customer alice = new Customer("Alice", "123 Main St.", "555-1234", standardClub);
        Customer bob = new Customer("Bob", "456 High St.", "555-5678", premiumClub);

        // Create vehicles
        Vehicle ford = new Vehicle("Ford", "Mustang", 2022, 60.0);
        Vehicle chevy = new Vehicle("Chevrolet", "Camaro", 2021, 55.0);

        // Create rentals
        Rental rental1 = new Rental(alice, ford, LocalDate.of(2023, 8, 10), LocalDate.of(2023, 8, 12),
                new OnlinePayment("Credit Card"));
        Rental rental2 = new Rental(bob, chevy, LocalDate.of(2023, 8, 10), LocalDate.of(2023, 8, 15),
                new OnlinePayment("PayPal"));

        // Make payments
        rental1.getPayment().makePayment(rental1.getVehicle().getRentalPrice());
        rental2.getPayment().makePayment(rental2.getVehicle().getRentalPrice());

        // Add loyalty points
        rental1.getCustomer().getLoyaltyClub().addPoints((int) rental1.getVehicle().getRentalPrice());
        rental2.getCustomer().getLoyaltyClub().addPoints((int) rental2.getVehicle().getRentalPrice());

        // Print loyalty points
        System.out.println(alice.getName() + " has " + alice.getLoyaltyClub().getPoints() + " loyalty points.");
        System.out.println(bob.getName() + " has " + bob.getLoyaltyClub().getPoints() + " loyalty points.");

        printRentalDetails(rental1);
        printRentalDetails(rental2);
    }

    // Additional method to print rental details
    private static void printRentalDetails(Rental rental) {
        System.out.println("Rental Details:");
        System.out.println("Customer: " + rental.getCustomer().getName());
        System.out.println("Vehicle: " + rental.getVehicle().getMake() + " " + rental.getVehicle().getModel());
        System.out.println("Start Date: " + rental.getStartDate());
        System.out.println("End Date: " + rental.getEndDate());
        System.out.println("Payment Method: " + (rental.getPayment() instanceof OnlinePayment ? "Online" : "Unknown"));
        System.out.println();
    }
}
