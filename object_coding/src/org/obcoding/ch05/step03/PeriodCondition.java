package org.obcoding.ch05.step03;

public class PeriodCondition implements DiscountCondition{
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
