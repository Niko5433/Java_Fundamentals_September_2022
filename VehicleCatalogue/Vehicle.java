package VehicleCatalogue;

public class Vehicle {
    //truck Man red 200

    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }
    public String getType(){
        return this.type;
    }
    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return this.color;
    }
    public int getHorsepower(){
        return this.horsepower;
    }

    public String toString(){
        String formattedType = "";
        if (this.type.equals("car")){
            formattedType = "Car";
        } else {
            formattedType = "Truck";
        }

        return String.format("Type: %s%n" +
                "Model: %s%nColor: %s%n" +
                "Horsepower: %d",formattedType,this.model,this.color, this.horsepower);
    }

}
