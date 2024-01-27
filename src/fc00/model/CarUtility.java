package fc00.model;

public class CarUtility {
    public String carName;
    public String carOwner;
    public String carType;
    public int carSn;
    public int carPrice;
    public int carYear;

    public void carInform(CarUtility car){
        System.out.println(car.carName+"\t"+car.carOwner+"\t"+car.carType+"\t"+car.carSn+"\t"+car.carPrice+"\t"+car.carYear);
    }
}
