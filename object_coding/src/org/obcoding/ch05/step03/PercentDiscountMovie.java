package org.obcoding.ch05.step03;

import java.time.Duration;

public class PercentDiscountMovie extends Movie{
    private double percent;
    public PercentDiscountMovie(String title, Duration runningTime,
                                Money fee, double percent,
                                DiscountCondition... discountconditions) {
        super(title, runningTime, fee, discountconditions);
        this.percent = percent;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return getFee().times(percent);
    }
}
