package com.example.coupang.domain.payment;

import com.example.coupang.domain.enums.CardCompany;
import com.example.coupang.domain.enums.PaymentType;
import com.example.coupang.domain.orders.Orders;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Setter
@Getter
@ToString
public class PaymentCommand {

    private BigDecimal payAmount;
    private String payCompanyCode;  // 결제사에서 발급한 결제코드
    private PaymentType paymentType;
    private CardCompany cardCompany;
    private String cardNo;
    private String cardExpYear;
    private String cardExpMon;
    private String cardCvv;
    private String cardPw;

    public Payment toEntity(Orders orders) {
        var payment = Payment.builder()
                .payAmount(payAmount)
                .payCompanyCode(payCompanyCode)
                .paymentType(paymentType)
                .cardCompany(cardCompany)
                .cardExpYear(cardExpYear)
                .cardExpMon(cardExpMon)
                .cardNo(cardNo)
                .cardCvv(cardCvv)
                .cardPw(cardPw)
                .build();

        payment.setOrders(orders);
        return payment;
    }

}
