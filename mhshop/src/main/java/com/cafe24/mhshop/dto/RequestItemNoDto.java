package com.cafe24.mhshop.dto;

import javax.validation.constraints.NotNull;

public class RequestItemNoDto {
	@NotNull
	private Long itemNo;

	public Long getItemNo() {
		return itemNo;
	}

	public void setItemNo(Long itemNo) {
		this.itemNo = itemNo;
	}


}
