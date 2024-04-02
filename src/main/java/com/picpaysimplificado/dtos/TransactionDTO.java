package com.picpaysimplificado.dtos;

import java.math.BigDecimal;

public record TransactionDTO (BigDecimal value, Long senderId, Long receiverId) {

	//public Long getsenderId() {
	//	return senderId;
	//}
	
	//public Long getreceiverId() {
	//	return receiverId;
	//}

}
