package com.book.show.bookshow.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class MovieDay {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long day_id;


    @Column(nullable = false, name = "show_date")
    private LocalDateTime show_date;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "movieDay", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("theatre")
    private List<M_Show> showList = new ArrayList<>();


}
