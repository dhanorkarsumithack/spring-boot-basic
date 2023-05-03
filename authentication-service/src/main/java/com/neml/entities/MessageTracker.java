package com.neml.entities;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="message_Tracker")
public class MessageTracker {
	
	@Id
	private long msgId;
	
	
	private String msgTranscode;
	private String msgMessageType;
	private String msgParameters;
	private String msgMobileNos;
	private String msgRecipientsTo;
	private String msgRecipientsCc;
	private String msgRecipientsBcc;
	private String msgSubject;
	private String msgStatus;
	private Timestamp msgCreatedOn;
	private Double msgHasAttachment;
	private String msgAttachmentLocation;
	private String msgAttachmentFilename;
	private String msgOwner;
	private Timestamp msgModifiedOn;
}
