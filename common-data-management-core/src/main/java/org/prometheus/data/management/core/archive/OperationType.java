package org.prometheus.data.management.core.archive;

public enum OperationType {

    /**
     * TOP PRIORITY
     *
     *
     * METHOD SEQUENCE
     *
     * 1. RETREIVE ALL RECORDS WITH CLEAN_OLD_ONLY OPERATION TYPE
     * 2.
     *
     */
    //api
    CLEAN,
    CLEAN_OLD_ONLY,

    /**
     * 50&
     */
    COPY_AND_CLEAN,
    MOVE_AND_CLEN,
    COMPORESS_MOVE_AND_CLEAN;



}
