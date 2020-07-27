package org.obcoding.ch02.policy;

import org.obcoding.ch02.domain.Money;
import org.obcoding.ch02.domain.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
