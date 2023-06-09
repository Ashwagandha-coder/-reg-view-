package com.example.religionapp.other;

import java.lang.annotation.Annotation;

public class JavaFile implements Open {
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}

@interface Open {


}
