import static org.junit.Assert.*;

import org.junit.Test;


public class SegmentTest1 {
	@Test	
	public void testPlus() {
		Vector3D a = new Vector3D();
		Vector3D b = new Vector3D(0,5,0);
		Segment ab = new Segment(a,b);
		Vector3D c = new Vector3D(1,5,0);
		double res = ab.distanceTo(c);
		System.out.println(res);
		
		Vector2D start=new Vector2D();
		Vector2D end= new Vector2D(0,2);
		Vector2D point=new Vector2D(3,1);
		ab = new Segment(start,end);
		res = ab.distanceTo(point);
		System.out.println(res);
	  }
}