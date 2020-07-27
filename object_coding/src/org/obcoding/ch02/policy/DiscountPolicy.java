package org.obcoding.ch02.policy;

import org.obcoding.ch02.domain.Money;
import org.obcoding.ch02.domain.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
