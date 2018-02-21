package org.prometheus_core.service.file_management.model.result;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Generic class of results
 *
 * take a look at internet
 */

@Data
@Builder
public class AbstractResult {

    /**
     * This should track execution of single method
     * but not from technical perspective, but from bussines
     *
     * Archiving process started
     * Processing record 1 with path: /eeee/eeee/ee
     * kaddkfajdj
     * sda
     * sdf
     * s
     * f
     * Finished with success or with failure
     */
    List<String> messages;

}
