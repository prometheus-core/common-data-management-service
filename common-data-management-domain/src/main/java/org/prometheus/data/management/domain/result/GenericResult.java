package org.prometheus.data.management.domain.result;

import java.util.List;

public class GenericResult extends AbstractResult {

    GenericResult(List<String> messages) {
        super(messages);
    }

    public void streamToUI(){}
}
