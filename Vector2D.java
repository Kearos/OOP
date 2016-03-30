public final class Vector2D implements Vector {
	private Double X, Y;

	public Vector2D() {
		X = 0.0;
		Y = 0.0;
	}

	public Vector2D(double x, double y) {
		X = x;
		Y = y;
	}

	// ��������� ���������
	public Double getComponent(int i) {
		return i == 0 ? X : Y;
	}

	// ��������:
	// 1. �����������
	public int dimension() {
		return 2;
	}

	// 2. ��������� ������������
	public double scalar(Vector v) {
		return X * v.getComponent(0) + Y * v.getComponent(1);
	}

	// 3. �����
	public double len() {
		return Math.sqrt(X * X + Y * Y);
	}

	// 4. ��������� �� �����
	public Vector2D multiply(double factor) {
		X = X * factor;
		Y = Y * factor;
		return new Vector2D(X, Y);
	}

	// 5. �������� ��������
	public Vector2D add(Vector v) {
		X = X + v.getComponent(0);
		Y = Y + v.getComponent(1);
		return new Vector2D(X, Y);
	}

	// 6. ��������� ��������
	public Vector2D sub(Vector v) {
		X = X - v.getComponent(0);
		Y = Y - v.getComponent(1);
		return new Vector2D(X, Y);
	}
	
	public boolean equals(Vector lhs, Vector rhs)
	{
		return true;
	}
}