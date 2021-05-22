package pl.cinema.registrationAndLogin.repository;

import org.springframework.data.repository.CrudRepository;
import pl.cinema.registrationAndLogin.web.dto.ScreeningEntity;

import java.util.ArrayList;

public interface ScreeningRepository extends CrudRepository<ScreeningEntity,String> {
    ArrayList<ScreeningEntity> findAll();
}
