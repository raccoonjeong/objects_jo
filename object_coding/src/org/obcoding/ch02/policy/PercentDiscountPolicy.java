package org.obcoding.ch02.policy;

import org.obcoding.ch02.domain.Money;
import org.obcoding.ch02.domain.Screening;
import org.obcoding.ch02.condition.DiscountCondition;

public class PercentDiscountPolicy extends DiscountPolicy{
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
