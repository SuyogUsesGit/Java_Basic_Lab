package casestudy.assignment2;

public class Demo {
    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        traveler.setModeOfTravel('B');
        traveler.setNoOfTickets(3);
        Demo demo = new Demo();

        if(traveler.getModeOfTravel() == 'F') {
            demo.calculateAmount(500, traveler);
        } else if(traveler.getModeOfTravel() == 'T') {
            demo.calculateAmount(100, traveler);
        } else if(traveler.getModeOfTravel() == 'B') {
            demo.calculateAmount(50, traveler);
        }

        System.out.println(traveler.getAmount());
    }

    private void calculateAmount(int serviceChargePerTicket, Traveler traveler) {
        traveler.setAmount(serviceChargePerTicket * traveler.getNoOfTickets());
    }
}
