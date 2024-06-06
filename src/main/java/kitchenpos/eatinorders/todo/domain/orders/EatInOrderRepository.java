package kitchenpos.eatinorders.todo.domain.orders;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EatInOrderRepository {
    EatInOrder save(EatInOrder order);

    Optional<EatInOrder> findById(UUID id);

    List<EatInOrder> findAll();

    boolean existsByOrderTableIdAndStatusNot(UUID orderTableId, EatInOrderStatus status);
}

