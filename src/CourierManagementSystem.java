import java.util.ArrayList;
import java.util.List;

class Courier {
    private String courierName;

    public Courier(String name) {
        this.courierName = name;
    }

    public String getCourierName() {
        return courierName;
    }

    // Additional properties and methods related to the courier can be added here
}

class Shipment {
    private String trackingNumber;
    private String destination;
    private Courier courier;

    public Shipment(String trackingNumber, String destination, Courier courier) {
        this.trackingNumber = trackingNumber;
        this.destination = destination;
        this.courier = courier;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getDestination() {
        return destination;
    }

    public Courier getCourier() {
        return courier;
    }

    // Additional properties and methods related to the shipment can be added here
}

class Order {
    private String orderID;
    private String customerName;
    private Shipment shipment;

    public Order(String orderID, String customerName, Shipment shipment) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.shipment = shipment;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Shipment getShipment() {
        return shipment;
    }

    // Additional properties and methods related to the order can be added here
}

public class CourierManagementSystem {
    public static void main(String[] args) {
        Courier courierA = new Courier("Courier A");
        Shipment shipment1 = new Shipment("12345", "New York", courierA);
        Order order1 = new Order("0001", "John Doe", shipment1);

        System.out.println("Order ID: " + order1.getOrderID());
        System.out.println("Customer Name: " + order1.getCustomerName());
        System.out.println("Shipment Tracking Number: " + order1.getShipment().getTrackingNumber());
        System.out.println("Shipment Destination: " + order1.getShipment().getDestination());
        System.out.println("Courier Name: " + order1.getShipment().getCourier().getCourierName());
    }
}
