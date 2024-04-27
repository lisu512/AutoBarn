    package com.example.autobarn.service;

    import com.example.autobarn.dto.OrderDTO;
    import com.example.autobarn.entity.Order;
    import com.example.autobarn.repository.OrderRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    @Service
    public class OrderService {

        @Autowired
        private OrderRepository orderRepository;

        public OrderDTO createOrder(OrderDTO orderDTO) {
            Order order = new Order();
            order.setStatus(orderDTO.getStatus());
            order.setCustomerName(orderDTO.getCustomerName());
            order.setCustomerAddress(orderDTO.getCustomerAddress());
            Order savedOrder = orderRepository.save(order);
            return convertToDTO(savedOrder);
        }

        public OrderDTO updateOrderStatus(Integer orderId, String status) {
            Order order = orderRepository.findById(orderId).orElseThrow(() -> new RuntimeException("Order not found"));
            order.setStatus(status);
            Order updatedOrder = orderRepository.save(order);
            return convertToDTO(updatedOrder);
        }

        private OrderDTO convertToDTO(Order order) {
            OrderDTO dto = new OrderDTO();
            dto.setStatus(order.getStatus());
            dto.setCustomerName(order.getCustomerName());
            dto.setCustomerAddress(order.getCustomerAddress());
            return dto;
        }
    }
