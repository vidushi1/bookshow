package com.book.show.bookshow.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class Screen implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long screen_id;

    @Column(nullable = false, name = "capacity")
    private Integer capacity;

    @Column(nullable = false, name = "datetime")
    private LocalDateTime dateTime;

    @OneToMany( fetch = FetchType.LAZY,mappedBy = "screen", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("theatre")
    private List<S_Row> rowList = new ArrayList<>();
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "theatre_id")
    private Theatre theatre;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy ="screen")
    @JsonBackReference
    private M_Show movieShow;



//    public void setDateTime(String dateTime) {
//        if (ObjectUtils.isNotEmpty(dateTime)) {
//            this.dateTime = LocalDateTime.parse(dateTime,
//                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        }
//    }

//    //uni-directional one-to-many association
//    @OneToMany(cascade=CascadeType.ALL)
//    @JoinColumn(name="mshow_id")
//    private List<M_Show> showList;

}
