package com.yang.cicada.domain;

import java.util.Date;

public class HeartBeat {
	private final ServiceStatus status;
	private final String content;
	private final Date timestamp;

	public HeartBeat(ServiceStatus status, String content) {
		this.status = status;
		this.content = content;
		this.timestamp = new Date();
	}

	public ServiceStatus getStatus() {
		return status;
	}

	public String getContent() {
		return content;
	}

	public Date getTimestamp() {
		return timestamp;
	}
}
