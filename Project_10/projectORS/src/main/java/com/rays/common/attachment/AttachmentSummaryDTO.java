package com.rays.common.attachment;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Contains attached file information and data
 * @author Prashant Jha
 */

@Entity
@Table(name = "NCS_ATTACHMENT")
public class AttachmentSummaryDTO extends AttachmentBaseDTO {

}