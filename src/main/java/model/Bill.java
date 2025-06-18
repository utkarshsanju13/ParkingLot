package model;

import model.enums.BillStatus;

import java.time.LocalDateTime;

public class Bill extends BaseModel {

    private LocalDateTime exitTime;
    private int amount;
    private Gate exitGate;
    public BillStatus billStatus;
    private Ticket ticket;

    public Bill() {
    }

    public Bill(LocalDateTime exitTime, int amount, Gate exitGate, BillStatus billStatus, Ticket ticket) {
        this.exitTime = exitTime;
        this.amount = amount;
        this.exitGate = exitGate;
        this.billStatus = billStatus;
        this.ticket = ticket;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "exitTime=" + exitTime +
                ", amount=" + amount +
                ", exitGate=" + exitGate +
                ", billStatus=" + billStatus +
                '}';
    }
}
