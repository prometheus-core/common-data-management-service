package org.prometheus_core.service.file_management.model.result;

import java.util.List;

public class GenericResult extends AbstractResult {

    GenericResult(List<String> messages) {
        super(messages);
    }

    public void streamToUI(){}
}
