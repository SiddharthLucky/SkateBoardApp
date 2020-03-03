package com.skateboardshare.skateboard_Rest_API.service;

import com.skateboardshare.skateboard_Rest_API.models.Skateboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SkateboardJPAServiceInterface extends CrudRepository<Skateboard, Integer>
{
    public List<Skateboard> findAll();
    public Optional<Skateboard> findById(Integer integer);
}
