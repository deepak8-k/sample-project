package com.sopra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sopra.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}
