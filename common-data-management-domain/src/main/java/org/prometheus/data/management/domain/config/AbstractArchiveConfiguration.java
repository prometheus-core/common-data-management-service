package org.prometheus.data.management.domain.config;

import org.prometheus.data.management.domain.management.TimeUnit;


/**
 * R
 */
public class AbstractArchiveConfiguration {

    /**
     * if these compressAfter and compressandMove aftter
     * are same values and types, then do compressAndMove process
     *
     * or if compressAfter is simply null
     */
    private int compressAfterValue;
    private TimeUnit compressAfterUnitType;

    private int compressAndMoveAfterValue;
    private TimeUnit compressAndMoveAfterUnitType;

    /**
     * When to remove data from management folder.
     */
    private int retentionPeriodValue;
    private TimeUnit retentionPeriodUnitType;


}
