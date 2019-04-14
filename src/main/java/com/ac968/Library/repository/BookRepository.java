package com.ac968.Library.repository;

import com.ac968.Library.model.books;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<books, Integer> {


}