package org.obcoding.ch02.policy;

import org.obcoding.ch02.domain.Money;
import org.obcoding.ch02.domain.Screening;
import org.obcoding.ch02.condition.DiscountCondition;

public class AmountDiscountPolicy extends DefaultDiscountPolicy{
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return null;
    }
}
