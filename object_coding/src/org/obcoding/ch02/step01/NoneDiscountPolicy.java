package org.obcoding.ch02.step01;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }

//    @Override
//    protected Money getDiscountAmount(Screening screening) {
//        return Money.ZERO;
//    }
}
