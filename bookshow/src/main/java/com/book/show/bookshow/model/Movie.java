package com.book.show.bookshow.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = {"name","language" }) })
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long movie_id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "language")
    private String language;

    @Column(nullable = false, name = "genre")
    private String genre;

    @Column(nullable = false, name = "duration")
    private String duration;

    @Column(nullable = false, name = "releaseDate")
    private LocalDateTime releaseDate;

    @Column(nullable = false, name = "running")
    private Boolean running;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy ="movie")
    @JsonBackReference
    private M_Show m_show ;

    public Movie(final String name, final  String duration, final  String genre,
                 final  String language, final LocalDateTime releaseDate, final  Boolean running) {
      this.name=name;
      this.language=language;
      this.genre=genre;
      this.duration=duration;
      this.releaseDate=releaseDate;
      this.running=running;
    }
}
