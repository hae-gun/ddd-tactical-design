package kitchenpos.products.application;

import kitchenpos.menus.domain.Menu;
import kitchenpos.menus.domain.MenuProduct;
import kitchenpos.menus.domain.MenuRepository;
import kitchenpos.products.tobe.domain.Price;
import kitchenpos.products.tobe.domain.Product;
import kitchenpos.products.tobe.domain.ProductId;
import kitchenpos.products.tobe.domain.ProductRepository;
import kitchenpos.products.infra.PurgomalumClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.UUID;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final MenuRepository menuRepository;
    private final PurgomalumClient purgomalumClient;

    public ProductService(
        final ProductRepository productRepository,
        final MenuRepository menuRepository,
        final PurgomalumClient purgomalumClient
    ) {
        this.productRepository = productRepository;
        this.menuRepository = menuRepository;
        this.purgomalumClient = purgomalumClient;
    }

    @Transactional
    public Product create(final Product request) {
        final Product product = new Product();
        product.setProductId(new ProductId(UUID.randomUUID()));
        product.setProductName(request.getProductName());
        product.setPrice(request.getPrice());
        return productRepository.save(product);
    }

    @Transactional
    public Product changePrice(final ProductId productId, final Product request) {
        final Product product = productRepository.findById(productId)
            .orElseThrow(NoSuchElementException::new);

        product.setPrice(request.getPrice());
        final List<Menu> menus = menuRepository.findAllByProductId(productId.getId());
        for (final Menu menu : menus) {
            Price sum = new Price(BigDecimal.ZERO);
            for (final MenuProduct menuProduct : menu.getMenuProducts()) {
                menuProduct.setProduct(Product.convertAsisDomain(product));
                sum = sum.add(
                    menuProduct.getProduct()
                        .getPrice()
                        .multiply(BigDecimal.valueOf(menuProduct.getQuantity()))
                );
            }
            if (menu.getPrice().compareTo(sum.getPrice()) > 0) {
                menu.setDisplayed(false);
            }
        }
        return product;
    }

    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
