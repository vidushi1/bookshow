package com.book.show.bookshow.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "uuid")
public class Partner implements Serializable {


//    @NotNull
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "theatre_id", referencedColumnName = "theatre_id", nullable = false)
   // @OneToOne(mappedBy = "partner")

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true)
    private Long id;

    @Column(nullable = false, name = "full_name")
    private String full_name;

    @Column(nullable = false, name = "phone_no")
    private Integer phone_no;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name = "joining_date")
    private LocalDateTime joiningDate;

//    public void setJoiningDate(String dateInput) {
//        if (ObjectUtils.isNotEmpty(dateInput)) {
//            this.joiningDate = LocalDateTime.parse(dateInput,
//                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        }
//    }


    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy ="partner" )
    @JsonBackReference
    private Theatre theatre;

}
