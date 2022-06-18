package com.book.show.bookshow.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique=true)
    private String pHistory_id;

    //uni-directional one-to-many association
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="CUSTOMER_ID")
    private List<Customer> customerList;

    //uni-directional one-to-many association
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="BOOKING_ID")
    private List<Booking> bookingList;
}
