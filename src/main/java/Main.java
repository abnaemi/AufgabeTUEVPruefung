public class Main {

    public static void main(String[] args) {

        Car carxx= new Car (4,4,true,true);
        CarInspectionService tüv = new CarInspectionService();
        carxx.setNumberOfTires(2);
        System.out.println(carxx.getNumberOfTires());
        System.out.println(tüv.fourTiresChecker(carxx));
        System.out.println(tüv.seatBeltChecker(carxx));


    }
}
