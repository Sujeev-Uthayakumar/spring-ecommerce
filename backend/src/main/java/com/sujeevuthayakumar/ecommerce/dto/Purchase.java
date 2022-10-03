package com.sujeevuthayakumar.ecommerce.dto;

import com.sujeevuthayakumar.ecommerce.entity.Address;
import com.sujeevuthayakumar.ecommerce.entity.Customer;
import com.sujeevuthayakumar.ecommerce.entity.Order;
import com.sujeevuthayakumar.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
