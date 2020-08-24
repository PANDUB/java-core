package com.base.functionalinterfaces;

import java.util.function.Supplier;

public class MySupplier<T> {
    public  Byte get(T t)
    {
        if(t instanceof  Integer)
        {
            return  ((Integer) t).byteValue();
        }

        return null;
    }


}
