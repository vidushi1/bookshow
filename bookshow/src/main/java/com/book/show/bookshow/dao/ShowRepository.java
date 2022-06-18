package com.book.show.bookshow.dao;

import com.book.show.bookshow.model.M_Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<M_Show, String> {
}
