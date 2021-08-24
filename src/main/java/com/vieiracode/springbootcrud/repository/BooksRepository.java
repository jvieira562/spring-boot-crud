package com.vieiracode.springbootcrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.vieiracode.springbootcrud.model.BooksModel;

public interface BooksRepository extends CrudRepository<BooksModel, Integer> {

}
