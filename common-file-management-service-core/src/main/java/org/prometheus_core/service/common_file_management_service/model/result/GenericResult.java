package org.prometheus_core.service.common_file_management_service.model.result;

import java.util.List;

public class GenericResult extends AbstractResult {

    GenericResult(List<String> messages) {
        super(messages);
    }

    public void streamToUI(){}
}
