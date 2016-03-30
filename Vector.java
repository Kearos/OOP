public interface Vector {
	public int dimension(); // Размерность
	Double getComponent(int i); // Получиние координат
	double scalar(Vector v); // Скалярное произведение
	double len(); // Длина
	Vector multiply(double factor); // Умножение на скаляр
	Vector add(Vector v); // Сложение векторов
	Vector sub(Vector v); // Вычитание векторов
	
	boolean equals(Vector lhs, Vector rhs);
}