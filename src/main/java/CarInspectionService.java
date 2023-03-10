public class CarInspectionService {


  public boolean fourTiresChecker(Car car){
         return car.getNumberOfTires() == 4;

  }

    public boolean seatBeltChecker(Car car){
        return car.seatBealtExists() == true;
    }

    public boolean airBagChecker(Car car){
        return car.airBagExists() == true;
    }

    public boolean doorNumbersCorrectChecker (Car car){
       if ((car.getNumberOfDoors() == 3) || (car.getNumberOfDoors() == 3)){
           return true;
        }  return false;
    }

    public boolean checkCar (Car car){
      if ((car.getNumberOfTires() == 4) && (car.airBagExists() == true) &&  (car.airBagExists()==true) &&
              ((car.getNumberOfDoors() == 3) || (car.getNumberOfDoors() == 3))) {
          return true;
        }
        return false;
    }



}
