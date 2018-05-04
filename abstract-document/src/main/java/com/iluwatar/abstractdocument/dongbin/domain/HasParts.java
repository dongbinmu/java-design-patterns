package com.iluwatar.abstractdocument.dongbin.domain;

import com.iluwatar.abstractdocument.dongbin.Document;

import java.util.stream.Stream;

public interface HasParts extends Document {

    String PROPERTY = "parts";

    default Stream<Part> getParts() {
        return children(PROPERTY, Part::new);
    }
}
