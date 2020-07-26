package org.obcoding.ch02.condition;

import org.obcoding.ch02.domain.Screening;

public class SequenceCondition implements DiscountCondition{
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    // 특정 상영순번과 일치하는지 체크
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
