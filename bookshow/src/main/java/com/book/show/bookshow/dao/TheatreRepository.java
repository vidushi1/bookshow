package com.book.show.bookshow.dao;

import com.book.show.bookshow.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Long> {

//    @Override
//    @Query("from THEATRE t where  t.theatre_id = :id")
//    Optional<Theatre> findById(Long id);
  //  @Query("from Theatre t where t.name = :name")
    Theatre findByName(String name);

    @Query("from Theatre t where  t.address.city = :city and t.name = :name")
    Optional<Theatre> findTheatreByCityAndName(final String city, final String name);
}
