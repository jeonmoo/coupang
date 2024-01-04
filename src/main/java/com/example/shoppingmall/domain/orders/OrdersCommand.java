package com.example.shoppingmall.domain.orders;

import com.example.shoppingmall.domain.enums.Option;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

public class OrdersCommand {

    @NoArgsConstructor
    @AllArgsConstructor
    @Setter
    @Getter
    @Builder
    @ToString
    public static class RegistOrders {
        private String uid;
        private Integer totalQuantity;
        private List<OrdersDetail> ordersDetails;

        public Orders toEntity() {
            var orders = Orders.builder()
                    .uid(uid)
                    .totalQuantity(totalQuantity)
                    .build();

            // details 생성 및 연관관계설정
            var details = ordersDetails.stream()
                    .map(OrdersDetail::toEntity)
                    .toList();
            orders.setOrdersDetails(details);

            // payment 생성 및 연관관계설정
//            var payment = Payment.builder()
//                    .payAmount(orders.getTotalPrice())
//                    .paymentType(orders.getPaymentType())
//                    .build();
//            orders.setPayment(payment);

            return orders;
        }

        @NoArgsConstructor
        @AllArgsConstructor
        @Setter
        @Getter
        @Builder
        @ToString
        public static class OrdersDetail {
            private String productCode;
            private String productName;
            private Option option;
            private BigDecimal originPrice;   // 원래 가격
//            private BigDecimal discount;   // 할인액
//            private BigDecimal finalPrice;   // 최종 금액 ( 원래가격 - 할인액 )
            private Integer quantity;

            public com.example.shoppingmall.domain.orders.OrdersDetail toEntity() {
                return com.example.shoppingmall.domain.orders.OrdersDetail.builder()
                        .productCode(productCode)
                        .productName(productName)
                        .option(option)
                        .originPrice(originPrice)
                        .quantity(quantity)
//                        .discount(discount)
//                        .finalPrice(finalPrice)
                        .build();
            }
        }
    }

}
