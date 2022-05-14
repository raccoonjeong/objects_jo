package org.obcoding.ch01.after;

// 초대장, 티켓, 현금
public class Bag {
    private Long amount;
    private Invitaion invitaion;
    private Ticket ticket;

    public boolean hasInvitaion() {
        return invitaion != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitaion invitaion, long amount) {
        this.invitaion = invitaion;
        this.amount = amount;
    }
}
