package zerobase.weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WeatherApplicationTests {

	@Test
	public void equalTest() throws Exception {
		Assertions.assertEquals(1, 1);
	}

	@Test
	public void nullTest() throws Exception {
		Assertions.assertNull(null );
	}

	@Test
	public void trueTest() throws Exception {
		Assertions.assertTrue(1 == 1);
	}

}
