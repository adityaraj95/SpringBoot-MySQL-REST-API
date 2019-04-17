package com.ac968.Library.resource;

import com.ac968.Library.model.books;
import com.ac968.Library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/rest/books")
public class BookResource {

    @Autowired
    BookRepository bookRepository;

    @GetMapping(value = "/all")
    public List<books> getAll() {

        return bookRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<books> persist(@RequestBody final books book) {
        bookRepository.save(book);
        return bookRepository.findAll();
    }

    @GetMapping("/{Barcode}")
    public Optional<books> bookById(@PathVariable("Barcode") int Barcode) {

        return bookRepository.findById(Barcode);
    }

    @DeleteMapping("/delete/{Barcode}")
    public void deleteBook(@PathVariable("Barcode") int Barcode) {

        bookRepository.deleteById(Barcode);
    }

}
