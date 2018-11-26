package com.item1024.base.Annos;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Inherited
public @interface TestAnno {
    public String value() default "a";
}
