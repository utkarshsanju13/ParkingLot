package model;

import model.enums.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel{

    private int floorNumber;

    private List<ParkingSlot> parkingSlotsList;

    private ParkingFloorStatus parkingFloorStatus;

    private Gate entryGate;

    private Gate exitgate;

    public ParkingFloor() {
    }

    public ParkingFloor(int floorNumber, List<ParkingSlot> parkingSlotsList, ParkingFloorStatus parkingFloorStatus, Gate entryGate, Gate exitgate) {
        this.floorNumber = floorNumber;
        this.parkingSlotsList = parkingSlotsList;
        this.parkingFloorStatus = parkingFloorStatus;
        this.entryGate = entryGate;
        this.exitgate = exitgate;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlotsList() {
        return parkingSlotsList;
    }

    public void setParkingSlotsList(List<ParkingSlot> parkingSlotsList) {
        this.parkingSlotsList = parkingSlotsList;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitgate() {
        return exitgate;
    }

    public void setExitgate(Gate exitgate) {
        this.exitgate = exitgate;
    }
}
