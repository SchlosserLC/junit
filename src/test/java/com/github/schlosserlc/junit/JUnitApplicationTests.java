package com.github.schlosserlc.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JUnitApplicationTests {

	@Test
	void contextLoads() {

		int installment = 10;

		BigDecimal amound = new BigDecimal(2000);


		assertEquals(new BigDecimal(200), Calc.getValueInstallment(amound,installment));


	}

}
