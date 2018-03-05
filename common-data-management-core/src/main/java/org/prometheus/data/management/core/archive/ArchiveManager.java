package org.prometheus.data.management.core.archive;

import org.prometheus.data.management.core.model.management.ArchiveRecord;
import org.prometheus.data.management.core.model.result.GenericResult;
import org.prometheus_core.service.file_management.model.management.ArchiveRecord;
import org.prometheus_core.service.file_management.model.result.GenericResult;

import java.util.List;

public class ArchiveManager
    extends AbstractArchiveProvider
implements ArchiveProvider{


    @Override
    public Long createArchiveRecord(ArchiveRecord archiveRecord) {
        return null;
    }

    @Override
    public List<Long> createArchvieRecords(List<ArchiveRecord> archiveRecords) {
        return null;
    }

    @Override
    public List<ArchiveRecord> getAll() {
        return null;
    }

    @Override
    public ArchiveRecord getById(long id) {
        return null;
    }

    @Override
    public GenericResult processArchiveRecord(ArchiveRecord archiveRecord) {
        return null;
    }

    @Override
    public GenericResult processById(long id) {
        return null;
    }

    @Override
    public GenericResult storeArchiveRecord(ArchiveRecord archiveRecord) {
        return null;
    }

    @Override
    public List<GenericResult> processAll() {
        return null;
    }
}
