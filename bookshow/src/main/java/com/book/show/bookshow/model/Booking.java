package com.book.show.bookshow.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Booking implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String booking_id;

    @Column(nullable = false, name = "datetime")
    private ZonedDateTime datetime;

    @Column(nullable = false, name = "status")
    private Boolean status;


}
