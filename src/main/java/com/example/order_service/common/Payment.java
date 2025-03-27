package com.example.order_service.common;





public class Payment {


    private int paymentId;
    private String paymentStatus;
    private String transactionId;
    private int orderId;
    private double amount;

    public int getPaymentId() {
        return paymentId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
