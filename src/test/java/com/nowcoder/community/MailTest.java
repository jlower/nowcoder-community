package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * @Author lowo
 * @Email
 * @Date 2022/4/5
 * @Description community
 */

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTest {

	@Autowired
	private MailClient mailClient;

	@Test
	public void testMail(){
		mailClient.sendMail("lowo_auto_send@sina.com", "TEST", "hello");
	}


}
