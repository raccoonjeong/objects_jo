package org.obcoding.ch01.step03;

// 소극장: 관람객을 맞이함
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        // Theater는 ticketOffice가 ticketSeller 내부에 존재한다는 사실을 알지 못함.
        // sellTo 메시지를 이해하고 응답할 수 있다는 사실만 알고 있을 뿐임. >>>> "캡슐화" // 결합도가 낮아지고, 설계변경 쉬워짐.
        ticketSeller.sellTo(audience);
    }

}
