package org.obcoding.ch01.step03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    // public -> private
    private Ticket getTicket() {
        return tickets.remove(0);
    }

    // public -> private
    private  void minusAmount(Long amount) {
        this.amount -= amount;
    }

    // public -> private
    private  void plusAmount(Long amount) {
        this.amount += amount;
    }

    // new
    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }
}
