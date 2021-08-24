package com.vieiracode.springbootcrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vieiracode.springbootcrud.model.BooksModel;
import com.vieiracode.springbootcrud.repository.BooksRepository;

//	Define a lógica de negócios
@Service
public class BooksService {

	@Autowired
	BooksRepository booksRepository;

//	Obtem todos os registros de livros usando o método findaAll() de CrudRepository
	public List<BooksModel> getAllBooks() {
		List<BooksModel> books = new ArrayList<BooksModel>();
		booksRepository.findAll().forEach(books1 -> books.add(books1));
		return books;
	}

//	Obtem um registro específico usando o método findById() de CrudRepository
	public BooksModel getBooksById(int id) {
		return booksRepository.findById(id).get();
	}

//	Salva um registro específico usando o método save() de CrudRepository
	public void saveOrUpdate(BooksModel books) {
		booksRepository.save(books);
	}

//	Deleta um registro específico usando o método deleteById() de CrudRepository
	public void delete(int id) {
		booksRepository.deleteById(id);
	}

//	Atualiza um registro
	public void update(BooksModel books, int bookid) {
		booksRepository.save(books);
	}

}
