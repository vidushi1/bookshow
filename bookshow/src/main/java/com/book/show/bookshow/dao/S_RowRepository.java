package com.book.show.bookshow.dao;

import com.book.show.bookshow.model.S_Row;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface S_RowRepository extends JpaRepository<S_Row, Long> {

}
