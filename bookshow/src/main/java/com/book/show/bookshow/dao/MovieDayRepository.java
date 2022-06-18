package com.book.show.bookshow.dao;

import com.book.show.bookshow.model.MovieDay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDayRepository extends JpaRepository<MovieDay, Long> {
}
