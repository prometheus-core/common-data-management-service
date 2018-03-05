package org.prometheus.data.management.domain.management;

public class Example {

    public void some(){
        ArchiveRecord archiveRecord =
                new ArchiveRecord.ArchiveRecordBuilder()
                .limitSourceSizeUnit(SizeUnit.KB)
                .id(33)
                .build();




    }
}
