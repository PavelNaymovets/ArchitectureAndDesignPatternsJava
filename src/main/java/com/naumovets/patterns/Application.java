package com.naumovets.patterns;

import com.naumovets.patterns.Builder.OrderDto;
import com.naumovets.patterns.Builder.OrderItemDto;
import com.naumovets.patterns.Facade.validator.OrderValidator;
import com.naumovets.patterns.Facade.validator.OrderValidatorImpl;
import com.naumovets.patterns.Iterator.Iterator;
import com.naumovets.patterns.Iterator.ListIterator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.naumovets.patterns.Builder.OrderDto.builder;

public class Application {
    public static void main(String[] args) {
        //=====================================================
        // Pattern Builder - порождающий паттерн
        //=====================================================

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

        //=====================================================
        // Pattern Facade - структурный паттерн
        //=====================================================

        /*
         Facade - паттерн задача которого предоставить простой интерфейс и скрыть сложную реализацию от пользователя.
         Реализуется с помощью интерфейса и класса реализующего этот интерфейс. В проекте интернет-магазина был применен
         паатер facade для валидации данных из формы для заказа. Данные содержат информацию о пользователе и заказе, которую
         нужно проверить на корректность написания (имя, телефон, адрес). При этом использование facade позволяет применить
         динамическое связывание ссылки с кодом и подставить нужную реализацию методов во время компиляции.
        */
        OrderValidator orderValidator = new OrderValidatorImpl();
        orderValidator.validate("Ivan", "8(911)295-96-84", "Россия,г.Москва,ул.Нахимова,дом 2,кв.18");

        //=====================================================
        // Pattern Iterator - поведенческий паттерн
        //=====================================================

        /*
         Iterator - паттерн задача которого предоставьте интерфейс для перебора элементов. В проекте интернет-магазина
         применял для перебора элементов коллекции ArrayList<>() в виде for each метода, который является синтаксическим
         сахаром и по сути реализован через Iterator.
        */

        List<String> list = new ArrayList<>(List.of("word", "inside", "list"));
        Iterator<String> iterator = new ListIterator<>(list);

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
