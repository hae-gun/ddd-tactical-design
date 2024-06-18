package kitchenpos.products.tobe.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("tobeJpaProductRepository")
public interface JpaProductRepository extends ProductRepository, JpaRepository<Product, UUID> {


}
