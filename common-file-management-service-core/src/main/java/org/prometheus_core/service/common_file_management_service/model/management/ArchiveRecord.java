package org.prometheus_core.service.common_file_management_service.model.management;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.prometheus_core.service.common_file_management_service.model.config.LocalArchiveConfiguration;
import org.prometheus_core.service.common_file_management_service.model.endpoint.DataEndpoint;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor

public class ArchiveRecord {



    //@Column(name = "id")
    private long id;
    /**
     *
     */
    //@Column (name = "data_endpoint")
    private DataEndpoint sourceEndpoint;

    /**
     * This represents business project group and
     * exists as root directory.
     *
     * Can also consists of multiple directories, but
     * doesn't not require to support masking.
     *
     * Example: /top_directory on the drive
     */
    //@Column (name = "", columnDefinition = "text")
    private String sourceRoot;

    /**
     * Represents project folder.
     * could consists of single or multiple directories
     *
     * Must support masking as following example:
     * /folder1/folder2/YYYY/MM/DD
     *
     * The whole path to files to be archived is represented as:
     * sourceRoot + source field
     *   Example: Britned_Publicoreso\yyyy\MM
     *
     *   source.add("Britned_Publiccoreso")
     *   source.add(TimeMask.YYYY)
     *   source.

     *
     *
     */
    private List<Object> source;

    private FileMask sourceObjectMask;

    /**
     * Number representing size of directory
     */
    private double limitSourceSizeValue;
    /**
     *
     */
    private SizeUnit limitSourceSizeUnit;


    /**
     * Number representing size of directory
     */
    private double limitTargetSizeValue;
    /**
     *
     */
    private SizeUnit limitTargetSizeUnit;

    private DataEndpoint targetEndpoint;
    private String targetRoot;
    private String target;
    private FileMask targetFileMask;
    /**
     * usually will be null; but is used for exceptions
     *
     * in GlobalConfiguration there is:
     * clean all Thumb.db fils (Windows thumbnails)
     *
     * There can be exception in Local:
     * don't clean
     *
     * For now: not sure if required
     */
    private LocalArchiveConfiguration localConfiguration;


}
