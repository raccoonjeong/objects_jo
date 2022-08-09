package org.obcoding.ch05.step03;

public class SequenceCondition implements DiscountCondition{
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
