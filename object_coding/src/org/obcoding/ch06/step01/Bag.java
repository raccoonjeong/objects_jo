package org.obcoding.ch06.step01;

import org.obcoding.ch01.step01.Invitation;
import org.obcoding.ch01.step01.Ticket;

// 가방: 관람객이 소지품을 보관함
public class Bag {
    private Long amount; // 현금
    private Invitation invitation; // 초대장
    private Ticket ticket; // 티켓


    public Bag(long amount) {
        this(null, amount);
    }
    //
    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        // 초대장 보유 여부
        return invitation != null;
    }

    public boolean hasTicket() {
        // 티켓 보유 여부
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        // 초대장을 티켓으로 교환하는 메서드
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
