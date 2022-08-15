package org.obcoding.ch06.step01;

import org.obcoding.ch01.step01.Audience;
import org.obcoding.ch01.step01.Ticket;
import org.obcoding.ch01.step01.TicketOffice;

public class TicketSeller {
    private TicketOffice ticketOffice; // 자신이 일하는 매표소를 알고있어야 함.

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

}
