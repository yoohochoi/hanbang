package hanbang.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import hanbang.domain.ShareHouse;
import hanbang.store.ShareHouseStore;
import hanbang.store.factory.SqlSessionFactoryProvider;
import hanbang.store.mapper.ShareHouseMapper;

public class ShareHouseStoreLogic implements ShareHouseStore {

	private SqlSessionFactory factory;

	public ShareHouseStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public int create(ShareHouse shareHouse) {
		SqlSession session = factory.openSession();
		int check = 0;

		try {
			ShareHouseMapper mapper = session.getMapper(ShareHouseMapper.class);
			check = mapper.create(shareHouse);
			session.commit();
		} finally {
			session.close();
		}

		return check;
	}

	@Override
	public List<ShareHouse> retriveAll() {
		SqlSession session = factory.openSession();
		List<ShareHouse> list = null;
		try {
			ShareHouseMapper mapper = session.getMapper(ShareHouseMapper.class);
			list = mapper.retriveAll();
		} finally {
			session.close();
		}

		return list;
	}

	@Override
	public ShareHouse retrive(int shareHouseId) {
		SqlSession session = factory.openSession();
		ShareHouse shareHouse = null;
		try {
			ShareHouseMapper mapper = session.getMapper(ShareHouseMapper.class);
			shareHouse = mapper.retrive(shareHouseId);
		} finally {
			session.close();
		}

		return shareHouse;
	}

	@Override
	public int update(ShareHouse shareHouse) {
		SqlSession session = factory.openSession();
		int check = 0;

		try {
			ShareHouseMapper mapper = session.getMapper(ShareHouseMapper.class);
			check = mapper.update(shareHouse);
			session.commit();
		} finally {
			session.close();
		}

		return check;
	}

	@Override
	public int delete(int shareHouseId) {
		SqlSession session = factory.openSession();
		int check = 0;

		try {
			ShareHouseMapper mapper = session.getMapper(ShareHouseMapper.class);
			check = mapper.delete(shareHouseId);
			session.commit();
		} finally {
			session.close();
		}

		return check;
	}

	@Override
	public List<ShareHouse> retriveByMemberId(String memberId) {
		SqlSession session = factory.openSession();
		List<ShareHouse> list = null;
		try {
			ShareHouseMapper mapper = session.getMapper(ShareHouseMapper.class);
			list = mapper.retriveByMemberId(memberId);
		} finally {
			session.close();
		}

		return list;
	}

	@Override
	public List<ShareHouse> searchShareHouse(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int report(int shareHouseId, String memberId) {
		SqlSession session = factory.openSession();
		int check = 0;

		try {
			ShareHouseMapper mapper = session.getMapper(ShareHouseMapper.class);
			check = mapper.report(shareHouseId, memberId);
			session.commit();
		} finally {
			session.close();
		}

		return check;
	}

	@Override
	public int deleteByMemberId(String memberId) {
		SqlSession session = factory.openSession();
		int check = 0;

		try {
			ShareHouseMapper mapper = session.getMapper(ShareHouseMapper.class);
			check = mapper.deleteByMemberId(memberId);
			session.commit();
		} finally {
			session.close();
		}

		return check;
	}

}
