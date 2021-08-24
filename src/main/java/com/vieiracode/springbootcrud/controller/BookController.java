package com.vieiracode.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vieiracode.springbootcrud.model.BooksModel;
import com.vieiracode.springbootcrud.service.BooksService;

//	Marca a classe como um controlador
@RestController
public class BookController {

//	Injeta a classe BooksService
	@Autowired
	BooksService booksService;

	@GetMapping("/books")
	private List<BooksModel> getAllBooks() {
		return booksService.getAllBooks();
	}

// 	Mapeamento que traz detalhes de um livro específico
	@GetMapping("/book/{bookid}")
	private BooksModel getBooks(@PathVariable("bookid") long bookid) {
		return booksService.getBooksById(bookid);
	}

//	Mpeamento de exclusão que exclui um livro especificado
	@DeleteMapping("/book/{bookid}")
	private void deleteBook(@PathVariable("bookid") long bookid) {
		booksService.delete(bookid);
	}

//	Mapeamento de postagem que postam os detalhes do livro no bd
	@PostMapping("/books")
	private long saveBook(@RequestBody BooksModel books) {
		booksService.saveOrUpdate(books);
		return books.getBookid();
	}

//	Mapeamento de inserção que atualiza os detalhes de um livro
	@PutMapping("/books")
	private BooksModel update(@RequestBody BooksModel books) {
		booksService.saveOrUpdate(books);
		return books;
	}
}
