package org.example.projektisi.services;

import org.example.projektisi.model.Zdjecie;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ZdjecieService {
    private static final String URL = "https://jsonplaceholder.typicode.com/photos";

    public List<Zdjecie> pobierzZdjecia() {
        RestTemplate restTemplate = new RestTemplate();
        List<Zdjecie> wszystkieZdjecia = restTemplate.exchange(
                URL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Zdjecie>>() {}
        ).getBody();

        return wszystkieZdjecia.stream().limit(4).collect(Collectors.toList());
    }

}
