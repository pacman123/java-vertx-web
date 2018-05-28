package io.opentracing.contrib.vertx.ext.web;

import io.opentracing.propagation.TextMap;
import io.vertx.core.MultiMap;

import java.util.Iterator;
import java.util.Map;

public class MultiMapInjectAdapter implements TextMap {

    private MultiMap headers;

    public MultiMapInjectAdapter(io.vertx.rxjava.core.MultiMap rxHeaders) {
        this.headers = rxHeaders.getDelegate();

    }

    @Override
    public Iterator<Map.Entry<String, String>> iterator() {
        throw new UnsupportedOperationException();
    }


    @Override
    public void put(String key, String value) {
         headers.add(key, value);
    }
}
