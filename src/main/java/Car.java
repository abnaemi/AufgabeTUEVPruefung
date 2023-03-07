public class Car {

     int numberOfTires;
     int numberOfDoors;
     boolean seatBelt;
     boolean airbag;



    public Car () {

    }

    public Car (int numberOfTires, int numberOfDoors, boolean seatBelt, boolean airbag) {
        this.numberOfDoors= numberOfTires;
        this.numberOfDoors=numberOfDoors;
        this.seatBelt=seatBelt;
        this.airbag=airbag;

    }

    public Car(int numberOfTires) {
        this.numberOfTires =numberOfTires;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public int setNumberofTires(int numberOfTires){
        return this.numberOfDoors=numberOfTires;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int setNumberofDoors(int numberOfDoors){
       return this.numberOfDoors=numberOfDoors;
    }

    public boolean seatBealtExists(){
        if (seatBelt = true)
            return true;
        return false;
    }

    public boolean airBagExists(){
        if (airbag = true)
            return true;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        if (getNumberOfTires() != car.getNumberOfTires()) return false;
        if (getNumberOfDoors() != car.getNumberOfDoors()) return false;
        if (seatBelt != car.seatBelt) return false;
        return airbag == car.airbag;
    }

    @Override
    public int hashCode() {
        int result = getNumberOfTires();
        result = 31 * result + getNumberOfDoors();
        result = 31 * result + (seatBelt ? 1 : 0);
        result = 31 * result + (airbag ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfTires=" + numberOfTires +
                ", numberOfDoors=" + numberOfDoors +
                ", seatBelt=" + seatBelt +
                ", airbag=" + airbag +
                '}';
    }
}
