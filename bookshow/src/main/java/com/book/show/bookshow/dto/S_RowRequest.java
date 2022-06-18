package com.book.show.bookshow.dto;


import com.book.show.bookshow.model.Seat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class S_RowRequest {

    private Long srow_id;
    private String name;
    private double rate;
    private List<Seat> seatList;

    //    @ManyToOne
    //    @JoinColumn(name = "id")
    //    private RowType rowType;
//    //uni-directional one-to-many association
//    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinColumn(name = "seat_id")
//    private List<Seat> seatList;
}
