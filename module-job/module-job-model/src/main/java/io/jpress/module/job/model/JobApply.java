package io.jpress.module.job.model;

import io.jboot.db.annotation.Table;
import io.jpress.module.job.model.base.BaseJobApply;

/**
 * Generated by JPress.
 */
@Table(tableName = "job_apply", primaryKey = "id")
public class JobApply extends BaseJobApply<JobApply> {

    private static final long serialVersionUID = 1L;

    public static final String MOBILE_ENABLE = "job_mobile_enable";
    public static final String EMAIL_ENABLE = "job_email_enable";
    public static final String JOB_APPLY_ENABLE = "job_apply_enable";


    public static final String FILE_RESUME = "file-resume";
    public static final String FILE_ATTACHMENT = "file-attachment";



}

