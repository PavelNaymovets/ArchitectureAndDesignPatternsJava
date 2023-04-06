package com.naumovets.patterns;

import com.naumovets.patterns.Builder.OrderDto;
import com.naumovets.patterns.Builder.OrderItemDto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.naumovets.patterns.Builder.OrderDto.builder;

public class Application {
    public static void main(String[] args) {
        /*
         Использование порождающего паттерна builder на примере объекта для передачи
         данных заказа из домашнего проекта интернет-магазина
        */
        List<OrderItemDto> orderLine = new ArrayList<>();

        OrderItemDto orderItemDto = new OrderItemDto(
                1L,
                "Молоко",
                1L,
                10,
                BigDecimal.valueOf(100),
                BigDecimal.valueOf(1000)
        );

        orderLine.add(orderItemDto);

        OrderDto orderDto = builder()
                .id(1L)
                .username("Николай")
                .items(orderLine)
                .address("г.Москва")
                .phone("+7(923)983-34-56")
                .totalPrice(BigDecimal.valueOf(1000))
                .sequenceNumber(1)
                .build();

        //Убедимся, что объект создан корректно
        System.out.println(orderDto.toString());
    }
}
