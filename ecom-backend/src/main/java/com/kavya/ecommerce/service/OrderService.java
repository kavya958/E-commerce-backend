package com.kavya.ecommerce.service;

import com.kavya.ecommerce.model.Order;
import com.kavya.ecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getFilteredOrders(String orderId, String customer, String orderItem,
                                         String startDate, String endDate,
                                         Double minPrice, Double maxPrice,
                                         String status) {
        List<Order> allOrders = orderRepository.findAll();

        return allOrders.stream()
                .filter(o -> orderId == null || orderId.isBlank() || o.getOrderId().toLowerCase().contains(orderId.toLowerCase()))
                .filter(o -> customer == null || customer.isBlank() || o.getCustomer().toLowerCase().contains(customer.toLowerCase()))
                .filter(o -> orderItem == null || orderItem.isBlank() || o.getOrderItem().toLowerCase().contains(orderItem.toLowerCase()))
                .filter(o -> status == null || status.isBlank() || o.getStatus().equalsIgnoreCase(status))
                .filter(o -> {
                    if (startDate == null || startDate.isBlank()) return true;
                    LocalDate start = LocalDate.parse(startDate);
                    return !o.getDeliveryDate().isBefore(start);
                })
                .filter(o -> {
                    if (endDate == null || endDate.isBlank()) return true;
                    LocalDate end = LocalDate.parse(endDate);
                    return !o.getDeliveryDate().isAfter(end);
                })
                .filter(o -> minPrice == null || o.getDeliveryPricing() >= minPrice)
                .filter(o -> maxPrice == null || o.getDeliveryPricing() <= maxPrice)
                .collect(Collectors.toList());
    }
}


