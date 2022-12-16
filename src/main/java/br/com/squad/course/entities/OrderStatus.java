package br.com.squad.course.entities;

public enum OrderStatus {
    ;
    private int WAITING_PAYMENT;
    private int PAID;
    private int SHIPPED;
    private int DELIVERED;
    private int CANCELED;

    OrderStatus() {
    }
}
