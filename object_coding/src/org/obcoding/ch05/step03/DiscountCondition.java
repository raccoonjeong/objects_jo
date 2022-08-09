package org.obcoding.ch05.step03;

import java.time.DayOfWeek;
import java.time.LocalTime;

// 할인 조건의 경우 클래스들끼리 구현을 공유할 필요는 없음. -> 인터페이스!
public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);

    public default boolean isS() {
        return true;
    }
}
