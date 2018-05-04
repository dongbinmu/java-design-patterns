package com.iluwatar.abstractdocument.dongbin.domain;

import com.iluwatar.abstractdocument.dongbin.Document;

import java.util.Optional;

public interface HasType extends Document {

    String PROPERTY = "type";

    default Optional<String> getType() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
