package org.obcoding.ch04.step02;

import java.time.DayOfWeek;
import java.time.LocalTime;

// 할인 조건 구현
public class DiscountCondition {
    // 어떤 데이터를 관리할 것인가?
    private DiscountConditionType type;

    private int sequence;

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public DiscountConditionType getType() {
        return type;
    }

    // 어떤 오퍼레이션을 수행할 것인가?
    public boolean isDiscountable(DayOfWeek dayOfWeek, LocalTime time) {
        if (type != DiscountConditionType.PERIOD) {
            throw new IllegalArgumentException();
        }
        return this.dayOfWeek.equals(dayOfWeek) &&
                this.startTime.compareTo(time) <= 0 &&
                this.endTime.compareTo(time) >= 0;
    }

    public boolean isDiscountable(int sequence) {
        if (type != DiscountConditionType.SEQUENCE) {
            throw new IllegalArgumentException();
        }
        return this.sequence == sequence;
    }

//    public void setType(DiscountConditionType type) {
//        this.type = type;
//    }
//    public int getSequence() {
//        return sequence;
//    }
//
//    public void setSequence(int sequence) {
//        this.sequence = sequence;
//    }
//
//    public DayOfWeek getDayOfWeek() {
//        return dayOfWeek;
//    }
//
//    public void setDayOfWeek(DayOfWeek dayOfWeek) {
//        this.dayOfWeek = dayOfWeek;
//    }
//
//    public LocalTime getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(LocalTime startTime) {
//        this.startTime = startTime;
//    }
//
//    public LocalTime getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(LocalTime endTime) {
//        this.endTime = endTime;
//    }

}
