package model;

import java.time.LocalDateTime;

public class Ticket extends BaseModel {

    private LocalDateTime entryTime;
    private Gate entryGate;
    private ParkingSlot ParkingSlots;
    private Vehicle vehicle;

    public Ticket() {
    }

    public Ticket(LocalDateTime entryTime, Gate entryGate, ParkingSlot entryParkingSlots, Vehicle vehicle) {
        this.entryTime = entryTime;
        this.entryGate = entryGate;
        this.ParkingSlots = entryParkingSlots;
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public ParkingSlot getParkingSlots() {
        return ParkingSlots;
    }

    public void setParkingSlots(ParkingSlot parkingSlots) {
        this.ParkingSlots = parkingSlots;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "entryTime=" + entryTime +
                ", entryGate=" + entryGate +
                ", entryParkingSlots=" + ParkingSlots +
                ", vehicle=" + vehicle +
                '}';
    }
}
