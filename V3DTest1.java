import static org.junit.Assert.*;

import org.junit.Test;

public class V3DTest1 {
	@Test
	public void testSub() {
		Vector a = new Vector3D(2, 2, 2);
		Vector b = new Vector3D(0, 2, 1);
		Vector temp;
		temp = a.sub(b);
		
		boolean result = temp.equals(new Vector3D(2, 0, 1));
		assertEquals(result, true);
	}
	
	@Test
	public void testAdd()
	{
		Vector a = new Vector3D(0, 1, 1);
		Vector b = new Vector3D(1, 0, 0);
		Vector temp = a.add(b);
	}
	
	@Test
	public void testGetLen()
	{
		Vector a = new Vector3D(0, 2, 3);
		double tem;
		tem = a.len();
	}
	
	@Test
	public void testScalar()
	{
		Vector a = new Vector3D(1, 1, 1);
		Vector b = new Vector3D(1, 1, 1);
		double tem = a.scalar(b);
	}
	
	@Test
	public void testMult()
	{
		Vector a = new Vector3D(1, 1, 1);
		double c = 5;
		Vector temp = a.multiply(c);
	}
}