package tema13DefiningClasses;

public class Car {


    private String brand;
    private String model;
    private int horsePower;

    public Car(String passBrand, String passModel, int passHorsePower){
        this.brand = passBrand;
        this.model = passModel;
        this.horsePower = passHorsePower;
    }

    public Car(String brand, String model){
        this(brand, model, -1);
    }

    public Car(String brand, int horsePower){
        this(brand, "unknown", horsePower);
    }

    public Car(String brand){
        this(brand, "unknown", -1);
    }


    public String getModel(){
        return model;
    }

    public String getBrand(){
        return brand;
    }

    public int getHorsePower(){
        return horsePower;
    }

    public void setHorsePower(int passHorsePower){
        this.horsePower = passHorsePower;
    }

    @Override
    public String toString(){
        return String.format("The car is: %s %s - %d HP.",
                this.getBrand(), this.getModel(), this.getHorsePower());

    }




}
