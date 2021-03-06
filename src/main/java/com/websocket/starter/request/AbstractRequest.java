package com.websocket.starter.request;

import com.websocket.starter.common.RequestType;

/**
 * Abstract Web Socket Request
 * @author manjunathshetty
 *
 */
public class AbstractRequest {

	private RequestType type;

	protected AbstractRequest(RequestType type) {
		this.type = type;
	}

	public RequestType getType() {
		return type;
	}

	public void setType(RequestType type) {
		this.type = type;
	}

}
