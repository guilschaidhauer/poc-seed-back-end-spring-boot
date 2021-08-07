package com.gsc.pocseedspringboot.repositories;

import com.gsc.pocseedspringboot.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
