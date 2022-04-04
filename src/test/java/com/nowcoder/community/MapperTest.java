package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

/**
 * @Author lowo
 * @Email
 * @Date 2022/4/3
 * @Description community
 */

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testSelectUser(){
		User user = userMapper.selectById(101);
		System.out.println(user);
	}

	@Autowired
	private DiscussPostMapper discussPostMapper;

	@Test
	public void testSelectDiscussPost(){
		List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(0,0,10);
		for (DiscussPost discussPost : discussPosts) {
			System.out.println("discussPost = " + discussPost);
		}
		int count = discussPostMapper.selectDiscussPostRows(0);
		System.out.println("count = " + count);
	}

}
