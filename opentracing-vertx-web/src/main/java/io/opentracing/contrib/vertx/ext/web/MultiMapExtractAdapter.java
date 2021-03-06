package io.opentracing.contrib.vertx.ext.web;

import io.opentracing.propagation.TextMap;
import io.vertx.core.MultiMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Pavol Loffay
 */
public class MultiMapExtractAdapter implements TextMap {

    private MultiMap headers;

    public MultiMapExtractAdapter(io.vertx.rxjava.core.MultiMap rxHeaders ) {
        this.headers = rxHeaders.getDelegate();
    }

    @Override
    public Iterator<Map.Entry<String, String>> iterator() {
        return headers.entries().iterator();
    }

    @Override
    public void put(String key, String value) {
        throw new UnsupportedOperationException();
    }
}
