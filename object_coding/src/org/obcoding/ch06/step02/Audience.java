package org.obcoding.ch06.step02;

import org.obcoding.ch06.step02.Bag;
import org.obcoding.ch01.step01.Ticket;

// 관람객: 가방을 소지할 수 있음
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }

}
