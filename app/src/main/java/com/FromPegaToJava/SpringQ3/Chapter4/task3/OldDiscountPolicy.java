package com.FromPegaToJava.SpringQ3.Chapter4.task3;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("old")
public class OldDiscountPolicy implements DiscountPolicy{

    @Override
    public int getDiscount(int price){
        return price >= 10_000 ? 10 : 5;
    }
}
