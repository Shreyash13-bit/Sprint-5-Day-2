package com.example.library.factory;

import com.example.library.dto.BookDTO;
import com.example.library.entity.Book;

public class BookFactory {

    public static Book createBook(BookDTO dto) {
        return Book.builder()
                   .title(dto.getTitle())
                   .author(dto.getAuthor())
                   .genre(dto.getGenre())
                   .price(dto.getPrice())
                   .build();
    }
}