package io.corepro.sdk.models;

import java.math.BigInteger;
import io.corepro.sdk.utils.Base64;

public class FileContent {
	private String content;
	private String contentType;
	private BigInteger contentLength;
	
	public byte[] getRawContent(){
		return Base64.decode(this.content);
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public BigInteger getContentLength() {
		return contentLength;
	}
	public void setContentLength(BigInteger contentLength) {
		this.contentLength = contentLength;
	}
}
