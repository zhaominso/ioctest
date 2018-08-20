import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


/**
 * @author zhaomin
 * @data 18-8-20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppleTest {
	@Autowired
	private Apple apple;

	@Test
	public void testApple() {
		assertNotNull(apple);
		System.out.println(apple.toString());
	}
}
