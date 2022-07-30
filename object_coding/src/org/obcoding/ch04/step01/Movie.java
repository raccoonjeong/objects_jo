package org.obcoding.ch04.step01;

import org.obcoding.ch04.step01.DiscountCondition;
import org.obcoding.ch04.step01.Money;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

// 데이터를 결정해놓는 설계
public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;
    
    // 할인 조건의 목록.. 솔빈이가 말했던 방식??
    private List<DiscountCondition> discountConditions;

    // 정책의 종류를 결정하는 것
    private MovieType movieType;
    // 할인정책 금액 직접 정의
    private Money discountAmount;
    // 할인정책 비율 직접 정의
    private double discountPercent;

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public Money getFee() {
        return fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public List<DiscountCondition> getDiscountConditions() {
        return Collections.unmodifiableList(discountConditions);
    }

    public void setDiscountConditions(
            List<DiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public Money getDiscountAmount() {
        return discountAmount;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

}
