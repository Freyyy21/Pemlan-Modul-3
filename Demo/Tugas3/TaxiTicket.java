package Tugas3;

public class TaxiTicket extends Ticket implements Operational {
    public static final double TAX_RATE = 0.1;
    private double duration;
    private double speed;

    private static final double MIN_SPEED = 5;
    private static final double MAX_SPEED = 100;

    public TaxiTicket(TicketInfo ticketInfo){
        super(ticketInfo.passengerName(), ticketInfo.startLocation(), ticketInfo.destination(), ticketInfo.price());
        this.duration = ticketInfo.duration();
        this.speed = ticketInfo.speed();
    }

    @Override
    public void checkStatus(){
        System.out.println("Your taxi is haeding to " + destination);
    }

    @Override
    public void displayEstimatedDuration(){
        System.out.println("Estimated travel duration: " + duration + " minutes");
    }
    @Override
    public void displayRoute(){
        System.out.println("Route: " + startLocation + " -> " + destination);
    }

    public void sLowDown(double speedReduction){
        speed -= speedReduction;
        if (speed < MIN_SPEED)
            speed = MIN_SPEED;
            duration += speedReduction * 0.5;
            System.out.println("Taxi slowed down! Current speed: " + speed + " km/h");

    }

    public void speedUp(double speedIncrease){
        speed+= speedIncrease;
        if (speed > speedIncrease)
            speed = MAX_SPEED;
            System.out.println("Taxi speed up! Current speed: " + speed + " km/h");
    }

    @Override
    public void displayInfo(){
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Sart Location  : " + startLocation);
        System.out.println("Start Location : " + startLocation);
        System.out.println("Destination    : " + destination);
        System.out.println("Price          : " + price);
        System.out.println("Final Price    : " + calculatedFinalPrice());
    }

    private double calculatedFinalPrice() {
        return price + (price * TAX_RATE);
    }

    public void detailedInfo(){
        displayInfo();
        System.out.println("Duration      :" + duration + " minutes");
        System.out.println("Speed         :" + speed + " km/h");
    }

}
