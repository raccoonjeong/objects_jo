package org.obcoding.ch01.step03;

// 판매원: 매표소에서 초대장을 티켓으로 교환해 주거나 티켓을 판매하는 역할을 함.
public class TicketSeller {
    private TicketOffice ticketOffice; // 자신이 일하는 매표소를 알고있어야 함.

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

    public void sellTo(Audience audience) {
//        Ticket ticket = ticketOffice.getTicket();
//        ticketOffice.plusAmount(audience.buy(ticket));
        ticketOffice.sellTicketTo(audience); // 이 부분은 audience에 대한 괜한 의존성이 생김

    }

}
