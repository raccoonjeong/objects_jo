package org.obcoding.ch02.policy;

import org.obcoding.ch02.domain.Money;
import org.obcoding.ch02.domain.Screening;
import org.obcoding.ch02.condition.DiscountCondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions); // 어플리케이션 돌아가는 동안은 변경될 일 없으니 asList로 바로 담음
    }

    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) {
          if(each.isSatisfiedBy(screening)) {
              return getDiscountAmount(screening);
          }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
