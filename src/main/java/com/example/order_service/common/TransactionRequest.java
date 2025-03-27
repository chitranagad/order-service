package com.example.order_service.common;

import com.example.order_service.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

    private Order order;
    private Payment payment;

    public Order getOrder() {
        return order;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
