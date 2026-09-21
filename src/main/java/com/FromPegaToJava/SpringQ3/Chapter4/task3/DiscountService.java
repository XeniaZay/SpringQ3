package com.FromPegaToJava.SpringQ3.Chapter4.task3;

import com.FromPegaToJava.SpringQ3.Chapter4.task2.NotificationGateway;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {
    private final DiscountPolicy discountPolicy;

    public DiscountService(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }
    public int calculateDiscount(int price) {
        return discountPolicy.getDiscount(price);
    }

}