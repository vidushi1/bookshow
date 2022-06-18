package com.book.show.bookshow.model;


import com.fasterxml.jackson.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = {"name"}) })
@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "uuid")
public class Theatre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long theatre_id;

    @Column(nullable = false, name = "name", unique = true)
    private String name;

    @Embedded
    private Address address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "theatre", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("theatre")
    private List<Screen> screenList = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name =  "partner_id",referencedColumnName = "id")
    @JsonManagedReference
    private Partner partner;

}