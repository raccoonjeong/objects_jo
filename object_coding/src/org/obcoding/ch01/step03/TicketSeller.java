package org.obcoding.ch01.step03;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        // TicketOffice의 구현이 아닌 인터페이스에만 의존하게 되었다.
        ticketOffice.sellTicketTo(audience);
        // ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
