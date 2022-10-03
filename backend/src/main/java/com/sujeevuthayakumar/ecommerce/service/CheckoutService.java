package com.sujeevuthayakumar.ecommerce.service;

import com.sujeevuthayakumar.ecommerce.dto.Purchase;
import com.sujeevuthayakumar.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
