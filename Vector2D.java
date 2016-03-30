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

	// Получение координат
	public Double getComponent(int i) {
		return i == 0 ? X : Y;
	}

	// Операции:
	// 1. Размерность
	public int dimension() {
		return 2;
	}

	// 2. Скалярное произведение
	public double scalar(Vector v) {
		return X * v.getComponent(0) + Y * v.getComponent(1);
	}

	// 3. Длина
	public double len() {
		return Math.sqrt(X * X + Y * Y);
	}

	// 4. Умножение на число
	public Vector2D multiply(double factor) {
		X = X * factor;
		Y = Y * factor;
		return new Vector2D(X, Y);
	}

	// 5. Сложение векторов
	public Vector2D add(Vector v) {
		X = X + v.getComponent(0);
		Y = Y + v.getComponent(1);
		return new Vector2D(X, Y);
	}

	// 6. Вычитание векторов
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