package com.lisa.webmvc.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="orders")
public class Order {

    @Id

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID orderId;
    @Column
    private Instant orderedAt;
    @Column
    private String orderedBy;

    @OneToMany(mappedBy = "order")
    private List<OrderLine> orderLine;
}
