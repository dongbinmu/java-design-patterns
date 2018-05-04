package com.iluwatar.abstractdocument.dongbin.domain;

import com.iluwatar.abstractdocument.dongbin.Document;

import java.util.Optional;

public interface HasPrice extends Document {

    String PROPERTY = "price";

    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(PROPERTY));
    }
}
