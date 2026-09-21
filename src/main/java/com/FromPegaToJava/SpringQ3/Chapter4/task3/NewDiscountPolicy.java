package com.FromPegaToJava.SpringQ3.Chapter4.task3;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty
public class NewDiscountPolicy implements DiscountPolicy{

    @Override
    public int getDiscount(int price){
        return price >= 10_000 ? 15 : 7;
    }
}
