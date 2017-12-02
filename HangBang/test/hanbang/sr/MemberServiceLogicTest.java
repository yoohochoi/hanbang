<<<<<<< HEAD
package hanbang.sr;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hanbang.domain.Member;
import hanbang.service.MemberService;
import hanbang.service.logic.MemberServiceLogic;

public class MemberServiceLogicTest {
	
	private MemberService service;
	
	@Before
	public void setUp() {
		service = new MemberServiceLogic();
	}

//	@Test
//	public void testRegister() {
//		Member member = new Member();
//		member.setId("test");
//		member.setPassword("test");
//		member.setName("test");
//		member.setPhoneNumber(0105225332);
//		member.setEmail("testth_fkcdsc@nate.com");
//		member.setMemberTypeId(12);
//		service.register(member);
//		assertNotNull(member);
//	}

//	@Test
//	public void testFindAll() {
//		List<Member> list = service.findAll();
//		
//		assertEquals(3, list.size());
//	}

//	@Test
//	public void testFind() {
//		
//		Member member = service.find("test");
//		assertNotNull(member);
//	}
//
//	@Test
//	public void testModify() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRemove() {
//		service.remove("test");
//	}

}
=======
package hanbang.sr;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import hanbang.domain.Member;
import hanbang.service.MemberService;
import hanbang.service.logic.MemberServiceLogic;

public class MemberServiceLogicTest {
	
	private MemberService service;
	
	@Before
	public void setUp() {
		service = new MemberServiceLogic();
	}
	@Test
	public void testRegister() {
		Member member = new Member();
		member.setId("1fsgsgs");
		member.setPassword("1gsgsgs");
		member.setName("test");
		member.setPhoneNumber("0105225332");
		member.setEmail("testth_fkcdsc@nate.com");
		member.setMemberTypeId(1);
		service.register(member);
		assertNotNull(member);
	}


//	@Test
//	public void testFindAll() {
//		List<Member> list = service.findAll();
//		
//		assertEquals(3, list.size());
//	}

//	@Test
//	public void testFind() {
//		
//		Member member = service.find("test");
//		assertNotNull(member);
//	}
//
//	@Test
//	public void testModify() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRemove() {
//		service.remove("test");
//	}

}
>>>>>>> refs/remotes/origin/master