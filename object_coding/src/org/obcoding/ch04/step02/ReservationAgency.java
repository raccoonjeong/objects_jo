package org.obcoding.ch04.step02;

public class ReservationAgency {

    public Reservation reserve(Screening screening,
                               Customer customer,
                               int audienceCount) {
        // 최소한 결합도 측면에서 ReservationAgency에 의존성이 몰려있던
        // 첫 번째 설계보다는 개선된 것으로 보인다.
        Money fee = screening.calculateFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);
//        Movie movie = screening.getMovie();
//
//        boolean discountable = false;
//
//        for (DiscountCondition condition : movie.getDiscountConditions()) {
//            if (condition.getType() == DiscountConditionType.PERIOD) {
//                discountable = screening.getWhenScreened()
//                        .getDayOfWeek().equals(condition.getDayOfWeek())
//                        &&
//                        condition.getStartTime().compareTo(
//                                screening.getWhenScreened().toLocalTime()) <= 0
//                        &&
//                        condition.getEndTime().compareTo(
//                                screening.getWhenScreened().toLocalTime()) >= 0;
//
//            } else {
//                discountable = condition.getSequence() == screening.getSequence();
//            }
//
//            if (discountable) {
//                break;
//            }
//        }
//
//        Money fee;
//
//        if (discountable) {
//            Money discountAmount = Money.ZERO;
//            switch(movie.getMovieType()) {
//                case AMOUNT_DISCOUNT:
//                    discountAmount = movie.getDiscountAmount();
//                    break;
//                case PERCENT_DISCOUNT:
//                    discountAmount = movie.getFee().times(movie.getDiscountPercent());
//                    break;
//                case NONE_DISCOUNT:
//                    discountAmount = Money.ZERO;
//                    break;
//            }
//            fee = movie.getFee().minus(discountAmount).times(audienceCount);
//        } else {
//            fee = movie.getFee();
//        }
//
//        return new Reservation(customer, screening, fee, audienceCount);
     }
}
