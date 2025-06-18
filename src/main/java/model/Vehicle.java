package model;

import model.enums.VehicleType;

public class Vehicle extends BaseModel{

    private String vehicleNumber;
    private VehicleType VehicleType;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String vehicleNumber, VehicleType vehicleType, String color) {
        this.vehicleNumber = vehicleNumber;
        VehicleType = vehicleType;
        this.color = color;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        VehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", VehicleType=" + VehicleType +
                ", color='" + color + '\'' +
                '}';
    }
}
