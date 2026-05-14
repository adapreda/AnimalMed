package model;

public class Payment {

    private PaymentMethod PayMethod;
    private double PayAmount;
    private String PayDate;
    private PaymentStatus PayStatus;

    public Payment(PaymentMethod PayMethod, double PayAmount, String PayDate, PaymentStatus PayStatus) {
        this.PayMethod = PayMethod;
        this.PayAmount = PayAmount;
        this.PayDate = PayDate;
        this.PayStatus = PayStatus;
    }

    public PaymentMethod getPayMethod() {
        return PayMethod;
    }

    public double getPayAmount() {
        return PayAmount;
    }

    public String getPayDate() {
        return PayDate;
    }

    public PaymentStatus getPayStatus() {
        return PayStatus;
    }

    @Override
    public String toString() {
        return PayMethod + " " +  PayAmount + " " + PayDate + " " + PayStatus;
    }
}
