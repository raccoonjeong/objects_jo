package org.obcoding.ch05.step03;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public abstract class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    public Movie(String title, Duration runningTime, Money fee,
                 DiscountCondition... discountConditions) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountConditions = Arrays.asList(discountConditions);
    }
//    private MovieType movieType;
//    private Money discountAmount;
//    private double discountPercent;
//
//    private Money calculateDiscountAmount() {
//        switch (movieType) {
//            case AMOUNT_DISCOUNT:
//                return calculateAmountDiscountAmount();
//            case PERCENT_DISCOUNT:
//                return calculatePercentDiscountAmount();
//            case NONE_DISCOUNT:
//                return calculateNoneDiscountAmount();
//        }
//
//        throw new IllegalStateException();
//    }
//
//    private Money calculateAmountDiscountAmount() {
//        return discountAmount;
//    }
//
//    private Money calculatePercentDiscountAmount() {
//        return fee.times(discountPercent);
//    }

    protected Money getFee() {
        return fee;
    }
    public Money calculateMovieFee(Screening screening) {
        if (isDiscountable(screening)) {
            return fee.minus(calculateDiscountAmount());
        }
        return fee;
    }

    private boolean isDiscountable(Screening screening) {
        return discountConditions.stream()
                .anyMatch(condition -> condition.isSatisfiedBy(screening));
    }

    abstract protected Money calculateDiscountAmount();

}
