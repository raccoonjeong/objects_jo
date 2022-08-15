package org.obcoding.ch06.step02;

import org.obcoding.ch01.step01.Audience;
import org.obcoding.ch01.step01.Ticket;
import org.obcoding.ch06.step02.TicketSeller;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
       ticketSeller.setTicket(audience);
    }
}
