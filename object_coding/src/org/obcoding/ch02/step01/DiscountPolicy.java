package org.obcoding.ch02.step01;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
