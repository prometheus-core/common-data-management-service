package org.prometheus_core.service.file_manager.model.archive;

public class Example {

    public void some(){
        ArchiveRecord archiveRecord =
                new ArchiveRecord.ArchiveRecordBuilder()
                .limitSourceSizeUnit(SizeUnit.KB)
                .id(33)
                .build();




    }
}
