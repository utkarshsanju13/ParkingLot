package model;

import model.enums.PaymentMode;
import model.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel{

    private double amount;
    private PaymentMode paymentMode;
    private String transactionId;
    private PaymentStatus paymentStatus;
    private Bill bill;
    private LocalDateTime paymentTime;

    public Payment() {
    }

    public Payment(double amount, PaymentMode paymentMode, String transactionId, PaymentStatus paymentStatus, Bill bill, LocalDateTime paymentTime) {
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.transactionId = transactionId;
        this.paymentStatus = paymentStatus;
        this.bill = bill;
        this.paymentTime = paymentTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }
}
