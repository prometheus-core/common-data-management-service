package org.prometheus_core.service.file_manager.archive;

import org.prometheus_core.service.file_manager.model.archive.ArchiveRecord;
import org.prometheus_core.service.file_manager.model.result.ArchiveResult;
import org.prometheus_core.service.file_manager.model.result.GenericResult;
import org.prometheus_core.service.file_manager.model.result.Result;

import java.util.List;

/**
 * This is the core API interface
 * later to be wrapped by REST API - we will use OpenAPI 3.0 with swagger support
 * Oaut
 *
 *
 */
public interface ArchiveProvider {


    /**
     *
     * priority is to:
     * create new record and store it in database
     * create multiple records and store them List<records>
     */


// This is just database
    Long createArchiveRecord(ArchiveRecord archiveRecord);
    List<Long> createArchvieRecords(List<ArchiveRecord> archiveRecords);
    List<ArchiveRecord> getAll();
    ArchiveRecord getById(long id);


    /**
     * TOP PRIORITY FOR BRAINSTOMRING
     * @param archiveRecord
     * @return
     */
    GenericResult processArchiveRecord(ArchiveRecord archiveRecord);
    GenericResult processById(long id);










    GenericResult storeArchiveRecord(ArchiveRecord archiveRecord);

    List<GenericResult> processAll();







}
