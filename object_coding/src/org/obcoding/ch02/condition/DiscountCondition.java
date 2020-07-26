package org.obcoding.ch02.condition;

import org.obcoding.ch02.domain.Screening;

public interface DiscountCondition {
     boolean isSatisfiedBy(Screening screening);
}
