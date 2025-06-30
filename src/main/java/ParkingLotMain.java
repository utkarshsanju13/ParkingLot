import controller.BillController;
import controller.ParkingLotController;
import controller.TicketController;
import model.Bill;
import model.ParkingLot;
import model.Ticket;
import model.Vehicle;
import model.enums.VehicleType;
import repository.*;
import service.BillService;
import service.InitService;
import service.ParkingLotService;
import service.TicketService;

import java.util.Scanner;

public class ParkingLotMain {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSlotRepository parkingSlotRepository = new ParkingSlotRepository();
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        BillRepository billRepository = new BillRepository();

        InitService initService = new InitService(parkingLotRepository, parkingFloorRepository,parkingSlotRepository,gateRepository);
        ParkingLotService parkingLotService = new ParkingLotService(initService);
        TicketService ticketService = new TicketService(
                ticketRepository,
                parkingSlotRepository,
                parkingLotRepository,
                parkingFloorRepository,
                gateRepository
        );

        BillService billService = new BillService(
                billRepository,
                parkingLotRepository,
                parkingSlotRepository
        );

        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService);
        TicketController ticketController = new TicketController(ticketService);
        BillController billController = new BillController(billService);

        ParkingLot parkingLot  = parkingLotController.initializeParkingLot();
        System.out.println("Parking lot initialized");


        while (true) {
            System.out.println(" enter an option => 1. for entering Parking lot, 2. for exiting Parking lot " +
                    "3. Exiting Parking Lot ");
            int option = scanner.nextInt();
            if(option == 1) {
//                Vehicle vehicle = new Vehicle();
//                System.out.println("Welcome to our parking lot");
//                System.out.println("Please enter the vehicle details");
//                System.out.println("Enter vehicle number :");
//                String vehicleNumber = scanner.next();
//                vehicle.setVehicleNumber(vehicleNumber);
//                System.out.println("Please Choice Vehicle type : 1. TWO_WHEELER 2. FOUR WHEELER");
//                int vehicleType = scanner.nextInt();
//                if(vehicleType == 1){
//                    vehicle.setVehicleType(VehicleType.TWO_WHEELER);
//                }else if(vehicleType == 2){
//                    vehicle.setVehicleType(VehicleType.FOUR_WHEELER);
//                }
//                System.out.println("Please enter the parking lot id");
//                int parkingLotId = scanner.nextInt();
//                System.out.println("Please enter the enter gate ID");
//                int entId = scanner.nextInt();

                Ticket ticket =ticketController.generateTicket(new Vehicle("hjkj23",VehicleType.FOUR_WHEELER,"red"), 1001,1);
//                Ticket ticket =ticketController.generateTicket(vehicle, entId,parkingLotId);
                System.out.println("Ticket " + ticket);
            } else if(option == 2) {
                System.out.println("Please enter the ticket ID");
                int ticketID = scanner.nextInt();
                Bill bill = billController.generateBill(ticketController.getTicketById(ticketID),1);

                System.out.println("Bill " + bill);

            } else if (option == 3) {
                System.out.println("Thank for using Parking Lot");
                break;
            }
        }


    }

}
