package pl.cinema.registrationAndLogin.repository;


import org.springframework.data.repository.CrudRepository;
import pl.cinema.registrationAndLogin.web.dto.GenreEntity;





public interface GenreRepository extends CrudRepository<GenreEntity,String> {
/*
    @Query("select s.id, s.screening_date, s.movie_id, m.title, s.auditorium_id from screening s inner join movie m where m.id = :movie_id;")
    List<MovieScreening> findFilled();*/

}
