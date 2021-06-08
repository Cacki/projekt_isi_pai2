package pl.cinema.registrationAndLogin.repository;

import org.springframework.data.repository.CrudRepository;
import pl.cinema.registrationAndLogin.web.dto.MovieEntity;

import java.util.List;

public interface MovieRepository extends CrudRepository<MovieEntity,String> {
    List<MovieEntity> findAll();
}
