package org.obcoding.ch01.step03;

// 초대장, 티켓, 현금
public class Bag {
    private Long amount;
    private Invitaion invitaion;
    private Ticket ticket;

    // new
    public Long hold(Ticket ticket) {
        if (hasInvitaion()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    // public -> private
    private boolean hasInvitaion() {
        return invitaion != null;
    }

    // public -> private
    private boolean hasTicket() {
        return ticket != null;
    }

    // public -> private
    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // public -> private
    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
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
