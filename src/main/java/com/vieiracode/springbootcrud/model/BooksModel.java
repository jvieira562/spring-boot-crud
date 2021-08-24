package com.vieiracode.springbootcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//	Marca a classe como uma entidade
@Entity
//	Define o nome da classe co o nome da tabela ou podemos passar o nome da tabela
@Table
public class BooksModel {

	@Id // Define bookid como chave primaria
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) // Gera um id automaticamente
	private int bookid;
	@Column
	private String bookname;
	@Column
	private String author;
	@Column
	private int price;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BooksModel [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", price=" + price
				+ "]";
	}

}
