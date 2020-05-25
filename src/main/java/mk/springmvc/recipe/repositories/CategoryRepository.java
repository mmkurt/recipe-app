package mk.springmvc.recipe.repositories;

import mk.springmvc.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
