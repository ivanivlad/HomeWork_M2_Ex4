package ex1;

public class Car {
    private final String registrationNumber;

    public Car(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{"
                + "registrationNumber='" + registrationNumber + '\''
                + '}';
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
