package projectspring.transformers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectspring.transformers.model.Transformer;

public interface TransformerRepository extends JpaRepository<Transformer, Long> {
}
