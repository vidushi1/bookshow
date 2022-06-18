package com.book.show.bookshow.dao;

import com.book.show.bookshow.model.M_Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface M_ShowRepository extends JpaRepository<M_Show, Long> {
}
