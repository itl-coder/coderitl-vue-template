package com.coderitl.admin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class CoderitlAdminApplicationTests {

	@Test
	void contextLoads() {
		String encode = passwordEncoder.encode("1234");
		System.out.println("encode = " + encode);
	}

}
