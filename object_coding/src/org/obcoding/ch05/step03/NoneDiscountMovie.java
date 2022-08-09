package org.obcoding.ch05.step03;

import java.time.Duration;

public class NoneDiscountMovie extends Movie{
    public NoneDiscountMovie(String title, Duration runningTime, Money fee) {
        super(title, runningTime, fee);
    }

    @Override
    protected Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
