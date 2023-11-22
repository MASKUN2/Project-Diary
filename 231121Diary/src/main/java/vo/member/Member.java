package vo.member;

import java.time.LocalDateTime;

public class Member {
	private int memberNo;
	private String memberId;
	private String memberPw;
	private LocalDateTime createdate;
	
	public Member() {
	}
	
	private Member(int memberNo, String memberId, String memberPw, LocalDateTime createdate) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.createdate = createdate;
	}
	
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public LocalDateTime getCreatedate() {
		return createdate;
	}
	public void setCreatedate(LocalDateTime createdate) {
		this.createdate = createdate;
	}
	
	
	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPw=" + memberPw + ", createdate="
				+ createdate + "]";
	}


	//builder
	public static class builder{
		private int memberNo;
		private String memberId;
		private String memberPw;
		private LocalDateTime createdate;
		
		public Member build() {
			return new Member(this.memberNo, this.memberId, this.memberPw, this.createdate);
		}
		
		public builder memberNo(int memberNo) {
			this.memberNo = memberNo;
			return this;
		}
		public builder memberId(String memberId) {
			this.memberId = memberId;
			return this;
		}
		public builder memberPw(String memberPw) {
			this.memberPw = memberPw;
			return this;
		}
		public builder createdate(LocalDateTime createdate) {
			this.createdate = createdate;
			return this;
		}
	}
}