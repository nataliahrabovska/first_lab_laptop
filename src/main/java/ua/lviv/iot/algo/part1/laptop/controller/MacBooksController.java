package ua.lviv.iot.algo.part1.laptop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.algo.part1.laptop.service.MacBooksService;
import ua.lviv.iot.algo.part1.laptop.models.MacBook;

import java.util.List;

@RestController
@RequestMapping("/macbook")
public class MacBooksController {

    private final MacBooksService macBook;

    @Autowired
    public MacBooksController(final MacBooksService macBook) {
        this.macBook = macBook;
    }

    @GetMapping("/{id}")
    public ResponseEntity<MacBook> readById(@PathVariable("id") final Integer id) {
        return ResponseEntity.ok(macBook.readById(id));
    }

    @GetMapping
    public ResponseEntity<List<MacBook>> returnAll() {
        return ResponseEntity.ok(macBook.returnAll());
    }

    @PostMapping("/macbooks")
    public MacBook addMacBook(@RequestBody final MacBook laptop) {
        return macBook.addMacBook(laptop);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MacBook> deleteMacBook(@PathVariable("id") final Integer id) {
        macBook.deleteMacBook(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<MacBook> updateMacBook(@PathVariable("id") Integer id, @RequestBody final MacBook macBook1) {
        return ResponseEntity.ok(macBook.updateMacBook(macBook1, id));
    }

}
