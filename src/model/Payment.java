package model;

public class Payment {

    private static int CounterID = 0;

    private final int PaymentID;
    private int MedicalServiceID;
    private PaymentMethod PayMethod;
    private double PayAmount;
    private String PayDate;
    private PaymentStatus PayStatus;

    public Payment(PaymentMethod PayMethod, double PayAmount, String PayDate, PaymentStatus PayStatus) {
        this.PaymentID = ++CounterID;
        this.PayMethod = PayMethod;
        this.PayAmount = PayAmount;
        this.PayDate = PayDate;
        this.PayStatus = PayStatus;
    }

    void setMedicalServiceID(int medicalServiceID) {
        this.MedicalServiceID = medicalServiceID;
    }

    public int getPaymentID() {
        return PaymentID;
    }

    public int getMedicalServiceID() {
        return MedicalServiceID;
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
