package org.example.projektisi.services;

import org.example.projektisi.entity.Liczba;
import org.example.projektisi.repositories.LiczbaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiczbaService {
    private final LiczbaRepository liczbaRepository;
    public LiczbaService(LiczbaRepository liczbaRepository) {
        this.liczbaRepository = liczbaRepository;
    }

    public Liczba save(Liczba liczba) {
        return liczbaRepository.save(liczba);
    }


    public List<Liczba> findAll() {
        return liczbaRepository.findAll();
    }
}
