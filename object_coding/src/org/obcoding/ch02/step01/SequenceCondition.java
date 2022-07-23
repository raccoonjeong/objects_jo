package org.obcoding.ch02.step01;

// 순번 조건
public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        // 파라미터로 전달된 Screening의 상영 순번과 일치할 경우
        // 할인 가능한 것으로 판단함
        return screening.isSequence(sequence);
    }
}
