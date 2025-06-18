package model;

import model.enums.ParkingLotStatus;
import model.enums.ParkingSlotStatus;
import model.enums.VehicleType;

public class ParkingSlot extends BaseModel {

    private int parkingSlotNumber;
    private VehicleType vehicleType;
    private Vehicle vehicle;
    private ParkingSlotStatus parkingSlotStatus;

    public ParkingSlot() {
    }

    public ParkingSlot(int parkingSlotNumber, VehicleType vehicleType, Vehicle vehicle, ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotNumber = parkingSlotNumber;
        this.vehicleType = vehicleType;
        this.vehicle = vehicle;
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public int getParkingNumber() {
        return parkingSlotNumber;
    }

    public void setParkingNumber(int parkingSlotNumber) {
        this.parkingSlotNumber = parkingSlotNumber;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "parkingSlotNumber=" + parkingSlotNumber +
                ", vehicleType=" + vehicleType +
                ", vehicle=" + vehicle +
                ", parkingSlotStatus=" + parkingSlotStatus +
                '}';
    }
}
