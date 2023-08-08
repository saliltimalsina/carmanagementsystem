package assessment;

import java.time.LocalDate;

// Payment interface
interface Payment {
    boolean makePayment(double amount);
}

// Online payment class
class OnlinePayment implements Payment {
    private String paymentMethod;

    public OnlinePayment(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean makePayment(double amount) {
        System.out.println("Making an online payment of $" + amount + " using " + paymentMethod);
        // Implementation of online payment
        return true;
    }
}

// Loyalty Club interface
interface LoyaltyClub {
    void addPoints(int points);

    int getPoints();
}

// Standard Loyalty Club class
class StandardLoyaltyClub implements LoyaltyClub {
    private int points = 0;

    @Override
    public void addPoints(int points) {
        this.points += points;
    }

    @Override
    public int getPoints() {
        return points;
    }
}

// Premium Loyalty Club class
class PremiumLoyaltyClub implements LoyaltyClub {
    private int points = 0;

    @Override
    public void addPoints(int points) {
        this.points += (int) (points * 1.2);
    }

    @Override
    public int getPoints() {
        return points;
    }
}

// Customer class
class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private LoyaltyClub loyaltyClub;

    public Customer(String name, String address, String phoneNumber, LoyaltyClub loyaltyClub) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.loyaltyClub = loyaltyClub;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LoyaltyClub getLoyaltyClub() {
        return loyaltyClub;
    }
}

// Vehicle class
class Vehicle {
    private String make;
    private String model;
    private int year;
    private double rentalPrice;

    public Vehicle(String make, String model, int year, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalPrice = rentalPrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }
}

// Rental class
class Rental {
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    private Payment payment;

    public Rental(Customer customer, Vehicle vehicle, LocalDate startDate, LocalDate endDate, Payment payment) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Payment getPayment() {
        return payment;
    }
}
