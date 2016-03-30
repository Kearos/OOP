public interface Vector {
	public int dimension(); // �����������
	Double getComponent(int i); // ��������� ���������
	double scalar(Vector v); // ��������� ������������
	double len(); // �����
	Vector multiply(double factor); // ��������� �� ������
	Vector add(Vector v); // �������� ��������
	Vector sub(Vector v); // ��������� ��������
	
	boolean equals(Vector lhs, Vector rhs);
}