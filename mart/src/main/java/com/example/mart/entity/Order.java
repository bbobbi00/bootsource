package com.example.mart.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "orders") // table 명 order 사용불가
@Entity
public class Order {

    @SequenceGenerator(name = "mart_order_seq_gen", sequenceName = "order_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mart_order_seq_gen")
    @Id
    @Column(name = "order_id")
    private Long id; // 주문번호

    @ManyToOne
    private Member member;

    @CreatedDate
    private LocalDateTime orderDate;

    // 주문상태 - ORDER, CANCEL
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}
