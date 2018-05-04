package com.iluwatar.abstractdocument.dongbin.domain;

import com.iluwatar.abstractdocument.dongbin.AbstractDocument;

import java.util.Map;

public class Car extends AbstractDocument implements HasModel,HasPrice,HasParts {
    public Car(Map<String, Object> properties) {
        super(properties);
    }
}
