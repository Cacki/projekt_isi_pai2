package pl.cinema.registrationAndLogin.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.cinema.registrationAndLogin.web.dto.MovieScreening;

import java.util.List;


public interface MovieScreeningRepository extends CrudRepository<MovieScreening,String> {

    @Query(value = "select s.id, s.screening_date, s.movie_id, s.auditorium_id, m.title from screening s inner join movie m where m.id = s.movie_id;",
    nativeQuery = true)
    List<MovieScreening> findFilled();

}
