package casestudy.assignment3;

public class AutoGenerate {
    private static int countFlightCode = 100;
    private static int countTrainCode = 200;
    private static int countBusCode = 300;
    private static String countUniqueCode = "0000";
    private int vehicleCode;
    private char modeOfTravel;
    private String uniqueCode;

    AutoGenerate(char modeOfTravel) {
        this.modeOfTravel = modeOfTravel;
        switch (modeOfTravel) {
            case 'F':
                this.vehicleCode = ++countFlightCode;
                incrementString(countUniqueCode, this);
                break;
            case 'T':
                this.vehicleCode = ++countTrainCode;
                incrementString(countUniqueCode, this);
                break;
            case 'B':
                this.vehicleCode = ++countBusCode;
                incrementString(countUniqueCode, this);
                break;
        }
    }

    public void incrementString(String s, AutoGenerate autogen) {
        int number = Integer.parseInt(s);
        number++;
        String stringNumber = number+"";
        int loop = 4 - stringNumber.length();
        String appendZeros = "";
        while(loop!=0) {
            appendZeros = appendZeros + "0";
            loop--;
        }
        stringNumber = appendZeros + number;
        countUniqueCode = stringNumber;
        autogen.uniqueCode = countUniqueCode;
    }

    public void generateBookingConfirmationNumber() {
        System.out.println("Booking Confirmation Number is : " +
                            "115" + this.modeOfTravel + this.vehicleCode + this.uniqueCode);
    }


    public static void main(String[] args) {
        new AutoGenerate('F').generateBookingConfirmationNumber();
        new AutoGenerate('B').generateBookingConfirmationNumber();
        new AutoGenerate('T').generateBookingConfirmationNumber();
        new AutoGenerate('Z').generateBookingConfirmationNumber();

    }
}
