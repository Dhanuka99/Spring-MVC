package lk.ijse.spring.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data


public class Item {
    @Id
    private String itemCode;
    private String description;
    private int qty;
    private double unitPrice;


}
