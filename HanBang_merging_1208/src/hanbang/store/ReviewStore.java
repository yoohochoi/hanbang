package hanbang.store;

import java.util.List;
import java.util.Map;

import hanbang.domain.Review;

public interface ReviewStore {

	int create(Review review);

	List<Review> retriveAll(int shareHouseId);

	Review retrive(int retriveId);

	int update(Review review);

	int deleteByMemberId(String memberId);

	int deleteByReviewId(int reviewId);

	int deleteByShareHouse(int shareHouseId);

	int reviewReport(Map<String, Object> map);

}
