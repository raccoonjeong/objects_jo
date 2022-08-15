package org.obcoding.ch06.step01;

import org.obcoding.ch06.step01.Bag;

// 관람객: 가방을 소지할 수 있음
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

}
