package net.ddns.surveysintegradora.demo.repositories;

import net.ddns.surveysintegradora.demo.models.EncuestaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="http://localhost:4200/")
@Repository
@RepositoryRestResource(path = "encuestas", collectionResourceRel = "encuestas")
public interface EncuestaRepository extends CrudRepository<EncuestaModel, Integer> {
}
