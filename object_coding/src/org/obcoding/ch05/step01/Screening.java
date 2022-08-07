package org.obcoding.ch05.step01;


import java.time.LocalDateTime;

public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    public int getSequence() {
        return sequence;
    }

    // 예매에 대한 정보 전문가인 동시에 Reservation의 창조자
    // [예매하라] 메시지에 응답할 수 있어야 함.
    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    // 영화를 예매하기 위해서는 movie에게
    // [가격을 계산하라] 메시지를 전송해서 계산된 영화 요금을 반환받아야 함
    // calculateFee 메서드는 이렇게 반환된 요금에 예매 인원 수를 곱해서
    // 전체 예매 요금을 계산한 후 Reservation을 생성해서 반환한다.
    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
        // 송신자인 Screening의 의도를 표현함.
        // *Movie의 내부 구현에 대한 어떤 지식도 없이 전송할 메시지를 결정했음*
    }
}
