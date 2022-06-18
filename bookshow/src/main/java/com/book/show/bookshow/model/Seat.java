package com.book.show.bookshow.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Seat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seat_id;

    @Column(nullable = false, name = "seat_no")
    private String seat_no;

    @Column(nullable = false, name = "booked")
    private Boolean booked;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "srow_id")
    private S_Row s_row;

}
