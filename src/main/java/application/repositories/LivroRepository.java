package application.repositories;

import org.springframework.data.repository.CrudRepository;
import application.models.Livro;

public class LivroRepository extends CrudRepository<Livro, Integer> {
    
}
