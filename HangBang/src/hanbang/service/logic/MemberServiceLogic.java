package hanbang.service.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hanbang.domain.Member;
import hanbang.service.MemberService;
import hanbang.store.HouseStore;
import hanbang.store.InterestShareHouseStore;
import hanbang.store.MemberStore;
import hanbang.store.QuestionStore;
import hanbang.store.ReviewStore;
import hanbang.store.ShareHouseStore;

@Service
public class MemberServiceLogic implements MemberService {

	@Autowired
	private MemberStore memberStore;
	@Autowired
	private HouseStore houseStore;
	@Autowired
	private ShareHouseStore shareHouseStore;
	@Autowired
	private ReviewStore reviewStore;
	@Autowired
	private QuestionStore questionStore;
	@Autowired
	private InterestShareHouseStore interestStore;


	@Override
	public boolean register(Member member) {
		
		int check = memberStore.create(member);

		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Member> findAll() {

		return memberStore.retriveAll();
	}

	@Override
	public Member find(String memberId) {

		return memberStore.retrive(memberId);
	}

	@Override
	public boolean modify(Member member) {
		int check = memberStore.update(member);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean remove(String memberId) {
		int check = memberStore.delete(memberId);
		if (check > 0) {
			shareHouseStore.deleteByMemberId(memberId);
			houseStore.deleteByMemberId(memberId);
			reviewStore.deleteByMemberId(memberId);
			questionStore.deleteByMemberId(memberId);
			interestStore.deleteByMemberId(memberId);
			
			return true;
		} else {
			return false;
		}
	}
	
//	@Override
//	public boolean login(String memberId, String password) {
//
//		Member member = memberStore.retrive(memberId);
//
//		if (member.getPassword().equals(password)) {
//			return true;
//		} else {
//			return false;
//		}
//	}

}
