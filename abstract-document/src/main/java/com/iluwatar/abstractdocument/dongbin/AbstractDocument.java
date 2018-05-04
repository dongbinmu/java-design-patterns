package com.iluwatar.abstractdocument.dongbin;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class AbstractDocument implements Document {

    Map<String, Object> properties;

    public AbstractDocument(Map<String, Object> properties) {
        Objects.requireNonNull(properties, "properties is not null");
        this.properties = properties;
    }

    @Override
    public Void put(String key, Object value) {
        properties.put(key, value);
        return null;
    }

    @Override
    public Object get(String key) {
        return properties.get(key);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {

         Optional<List<Map<String, Object>>> any = Stream.of(get(key)).
                filter(o -> Objects.nonNull(o))
                .map(o -> (List<Map<String, Object>>) o).findAny();
        return any.isPresent()?any.get().stream().map(constructor):Stream.empty();
    }
}
