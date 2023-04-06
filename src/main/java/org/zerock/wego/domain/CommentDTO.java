package org.zerock.wego.domain;

import java.sql.Timestamp;
import lombok.Data;

@Data
public class CommentDTO {

	private Long commentId;			// 댓글 식별자
	private String targetGb;		// 소속 게시판   *
	private Long targetCd;			// 소속 글 식별자 *
	private String commentGb;		// 댓글 구분  
	private Long mentionId;			// 멘션 코드  
	private Long userId;			// 유저 코드 *
//	private Timestamp createdDt;	// 작성일 
//	private Timestamp modifiedDt;	// 수정일 
	private String contents;		// 댓글 내용 * 
	private String status;			// 삭제 상태값 
	
}// end class
