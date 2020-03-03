package com.skateboardshare.skateboard_Rest_API.service;

import com.skateboardshare.skateboard_Rest_API.models.Skateboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class SkateboardJPAService_JPA {

    @Autowired SkateboardJPAServiceInterface skateboradrepo;

    List<Skateboard> skateboards = new ArrayList<>();

    @Transactional
    public List<Skateboard> findAll() {
        return skateboradrepo.findAll();
    }

    @Transactional
    public Optional<Skateboard> findById(Integer integer) {
        for (Skateboard skateBoard : skateboradrepo.findAll()) {
            if (skateBoard.getId().equals(integer)) {
                return Optional.of(skateBoard);
            }
        }
        return null;
    }
}
