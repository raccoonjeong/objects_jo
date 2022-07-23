package org.obcoding.ch02.step01;

import java.time.Duration;

// 영화: 예매 요금을 계산하는 협력
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DefaultDiscountPolicy defaultDiscountPolicy;

    public Movie(String title, Duration runningTime,
                 Money fee, DefaultDiscountPolicy defaultDiscountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.defaultDiscountPolicy = defaultDiscountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
//        if (discountPolicy == null) {
//            return fee;
//        }
//        ---> 대신 NoneDiscountPolicy!

        return fee.minus(defaultDiscountPolicy.calculateDiscountAmount(screening));

    }
}
