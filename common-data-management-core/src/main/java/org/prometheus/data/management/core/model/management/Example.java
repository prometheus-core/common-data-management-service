package org.prometheus.data.management.core.model.management;

public class Example {

    public void some(){
        ArchiveRecord archiveRecord =
                new ArchiveRecord.ArchiveRecordBuilder()
                .limitSourceSizeUnit(SizeUnit.KB)
                .id(33)
                .build();




    }
}
