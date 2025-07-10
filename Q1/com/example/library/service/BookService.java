package com.example.library.service;

import com.example.library.dto.BookDTO;
import com.example.library.entity.Book;

import java.util.List;

public interface BookService {
    Book createBook(BookDTO dto);
    Book getBookById(Long id);
    List<Book> getAllBooks();
    void deleteBook(Long id);
}