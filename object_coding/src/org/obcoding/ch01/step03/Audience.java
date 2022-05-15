package org.obcoding.ch01.step03;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
//        if (bag.hasInvitaion()) {
//            bag.setTicket(ticket);
//            return 0L;
//        } else {
//            bag.minusAmount(ticket.getFee());
//            bag.setTicket(ticket);
//            return ticket.getFee();
//        }
    }
}
