package com.shop.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductTest {
    @Test
    void creationWithBuilder() {
        Product product = Product.builder()
                .id(1L)
                .name("milk")
                .maker("vologda")
                .price(5000)
                .build();

        assertThat(product.getId()).isEqualTo(1L);
        assertThat(product.getName()).isEqualTo("milk");
        assertThat(product.getMaker()).isEqualTo("vologda");
        assertThat(product.getPrice()).isEqualTo(5000);
        assertThat(product.getImageUrl()).isNull();
    }

    @Test
    void changeWith() {
        Product product = Product.builder()
                .id(1L)
                .name("bread")
                .maker("yar")
                .price(5000)
                .build();

        product.changeWith(Product.builder()
                .name("white bread")
                .maker("yar one")
                .price(10000)
                .build());

        assertThat(product.getName()).isEqualTo("white bread");
        assertThat(product.getMaker()).isEqualTo("yar one");
        assertThat(product.getPrice()).isEqualTo(10000);
    }
}
