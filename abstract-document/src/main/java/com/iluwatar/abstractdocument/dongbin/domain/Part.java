package com.iluwatar.abstractdocument.dongbin.domain;

import com.iluwatar.abstractdocument.dongbin.AbstractDocument;

import java.util.Map;

public class Part extends AbstractDocument implements HasModel, HasPrice, HasType {

    public Part(Map<String, Object> properties) {
        super(properties);
    }

}
