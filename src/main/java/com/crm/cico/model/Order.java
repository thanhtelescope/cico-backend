package com.crm.cico.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Order extends BaseEntity {
    
    private LocalDateTime visitTime;

    @ManyToOne
    private Account createdBy;
}