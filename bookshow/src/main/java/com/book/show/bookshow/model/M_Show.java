package com.book.show.bookshow.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class M_Show implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mshow_id;

    @Column(nullable = false, name = "datetime")
    private LocalDateTime datetime;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name =  "screen_id",referencedColumnName = "screen_id")
    private Screen screen;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name =  "movie_id",referencedColumnName = "movie_id")
    @JsonManagedReference
    private Movie movie ;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "day_id")
    // @JsonIgnoreProperties("screenList")
    private MovieDay movieDay;

//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name =  "partner_id",referencedColumnName = "id")
//    @JsonManagedReference
//    private Screen screen;
//
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name =  "partner_id",referencedColumnName = "id")
//    @JsonManagedReference
//    private Movie Movie ;

}
