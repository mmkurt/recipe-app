package mk.springmvc.recipe.repositories;

import mk.springmvc.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {



}
