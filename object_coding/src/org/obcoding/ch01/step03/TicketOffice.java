package org.obcoding.ch01.step03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 매표소: 관람객에게 판매할 티켓과 티켓의 판매 금액을 보관함
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void sellTicketTo(Audience audience) {

        plusAmount(audience.buy(getTicket()));

    }
}
