package com.iluwatar.abstractdocument.dongbin;

import com.iluwatar.abstractdocument.dongbin.domain.Car;
import com.iluwatar.abstractdocument.dongbin.domain.HasModel;
import com.iluwatar.abstractdocument.dongbin.domain.HasParts;
import com.iluwatar.abstractdocument.dongbin.domain.HasPrice;
import com.iluwatar.abstractdocument.dongbin.domain.HasType;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Object> carProperties = new HashMap<>();
        carProperties.put(HasPrice.PROPERTY, 1000);
        carProperties.put(HasModel.PROPERTY, "BW");

        Map<String, Object> carProperties1 = new HashMap<>();
        carProperties1.put(HasType.PROPERTY, "door");
        carProperties1.put(HasModel.PROPERTY, "QWE");
        carProperties1.put(HasPrice.PROPERTY, 2222);

        Map<String, Object> carProperties2 = new HashMap<>();
        carProperties2.put(HasType.PROPERTY, "window");
        carProperties2.put(HasModel.PROPERTY, "as");
        carProperties2.put(HasPrice.PROPERTY, 4444);
        carProperties.put(HasParts.PROPERTY, Arrays.asList(carProperties1, carProperties2));

        Car car = new Car(carProperties);

        System.out.println(car.getModel().get());
        System.out.println(car.getPrice().get());
        car.getParts().forEach(part -> System.out.println(part.getType().get()+":"+part.getModel().get()+":"+part.getPrice().get()));

    }
}
