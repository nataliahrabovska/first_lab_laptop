package ua.lviv.iot.algo.part1.laptop.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.laptop.models.MacBook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
@Scope("singleton")
public class MacBooksService {
    private Integer nextAvailable = 1;
    private Map<Integer, MacBook> map = new HashMap<>();

    public MacBook addMacBook(final MacBook macBook) {
        macBook.setId(nextAvailable++);
        map.put(macBook.getId(), macBook);
        return macBook;
    }

    public void deleteMacBook(final Integer id) {
        map.remove(id);
    }

    public MacBook updateMacBook(final MacBook macBook, final Integer id) {
        map.put(id, macBook);
        return macBook;
    }

    public MacBook readById(final Integer id) {
        return map.get(id);
    }

    public List<MacBook> returnAll() {
        return new LinkedList<>(map.values());
    }
}
