package model;

import model.enums.ParkingLotStatus;
import model.enums.VehicleType;
import service.Strategy.BillCalculationStrategy.BillCalculationStrategy;
import service.Strategy.SlotAllocationStrategy.SlotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel {

    private String parkingLotName;
    private String address;
    private String parkingLotDescription;
    private int capacity;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> vehicleTypesSupported;


    private List<ParkingFloor> parkingFloorList;
    private SlotAllocationStrategy slotAllocationStrategy;
    private BillCalculationStrategy  billCalculationStrategies;

    public ParkingLot() {
    }

    public ParkingLot(String parkingLotName, String address, String parkingLotDescription, int capacity, ParkingLotStatus parkingLotStatus, List<VehicleType> vehicleTypesSupported, List<ParkingFloor> parkingFloorList, SlotAllocationStrategy slotAllocationStrategy, BillCalculationStrategy billCalculationStrategies) {
        this.parkingLotName = parkingLotName;
        this.address = address;
        this.parkingLotDescription = parkingLotDescription;
        this.capacity = capacity;
        this.parkingLotStatus = parkingLotStatus;
        this.vehicleTypesSupported = vehicleTypesSupported;
        this.parkingFloorList = parkingFloorList;
        this.slotAllocationStrategy = slotAllocationStrategy;
        this.billCalculationStrategies = billCalculationStrategies;
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParkingLotDescription() {
        return parkingLotDescription;
    }

    public void setParkingLotDescription(String parkingLotDescription) {
        this.parkingLotDescription = parkingLotDescription;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<VehicleType> getVehicleTypesSupported() {
        return vehicleTypesSupported;
    }

    public void setVehicleTypesSupported(List<VehicleType> vehicleTypesSupported) {
        this.vehicleTypesSupported = vehicleTypesSupported;
    }

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public void setParkingFloorList(List<ParkingFloor> parkingFloorList) {
        this.parkingFloorList = parkingFloorList;
    }

    public SlotAllocationStrategy getSlotAllocationStrategy() {
        return slotAllocationStrategy;
    }

    public void setSlotAllocationStrategy(SlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public BillCalculationStrategy getBillCalculationStrategies() {
        return billCalculationStrategies;
    }

    public void setBillCalculationStrategies(BillCalculationStrategy billCalculationStrategies) {
        this.billCalculationStrategies = billCalculationStrategies;
    }
}
