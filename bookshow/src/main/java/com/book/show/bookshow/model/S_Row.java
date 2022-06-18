package com.book.show.bookshow.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class S_Row implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique=true)
    private Long srow_id;

     //    @ManyToOne
    //    @JoinColumn(name = "id")
    //    private RowType rowType;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "rate")
    private double rate;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "screen_id")
    // @JsonIgnoreProperties("screenList")
    private Screen screen;

    @OneToMany( fetch = FetchType.LAZY,mappedBy = "s_row", cascade = CascadeType.ALL)
   // @JsonIgnoreProperties("theatre")
    private List<Seat> seatList = new ArrayList<>();

//    //uni-directional one-to-many association
//    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinColumn(name = "seat_id")
//    private List<Seat> seatList;
}
