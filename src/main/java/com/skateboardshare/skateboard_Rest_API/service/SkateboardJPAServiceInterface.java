package com.skateboardshare.skateboard_Rest_API.service;

import com.skateboardshare.skateboard_Rest_API.models.Skateboard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkateboardJPAServiceInterface extends CrudRepository<Skateboard, Integer>
{

}
