public final class Vector3D implements Vector {
        private Double X, Y, Z;
        public Vector3D() {
                X = 0.0;
                Y = 0.0;
                Z = 0.0;
        }
        
        public Vector3D(double x, double y, double z) {
                X = x;
                Y = y;
                Z = z;
        }
        // Получение координат
        public Double getComponent(int i) {
                switch (i) {
                case 0: return X;
                case 1: return Y;
                case 2: return Z;
                default: return new Double(0);
                }
        }
        // Операции:
        // 1. Размерность
        public int dimension() {
                return 3;
        }
        // 2. Скалярное произведение
        public double scalar(Vector v) // 
        {
                return v.getComponent(0) * X + v.getComponent(1) * Y + v.getComponent(2) * Z;
        }
        // 3. Длина
        public double len() 
        {
                return Math.sqrt(X * X + Y * Y + Z * Z);
        }
        // 4. Умножение на число
        public Vector3D multiply(double mult) 
        {
                return new Vector3D(X * mult, Y * mult, Z * mult);
        }
        // 5. Сложение векторов
        public Vector3D add(Vector v) 
        {
                return new Vector3D(X + v.getComponent(0), Y + v.getComponent(1), Z + v.getComponent(2));
        }
        // 6. Вычитание векторов
        public Vector3D sub(Vector v) 
        {
                return new Vector3D(X - v.getComponent(0), Y - v.getComponent(1), Z - v.getComponent(2));
        }
        // 7. Вывод на экран
        public void printVector()
        {
                System.out.println("(" + X + ", " + Y + ", " + Z + ")");
        }
        
        public static void sayHello()
        {
        	System.out.println("Hello!");
        }
        
        public boolean equals(Vector lhs, Vector rhs)
    	{
        	boolean result = true;
        	for (int i = 0; i < 3; ++i)
        	{
        		result &= (lhs.getComponent(i)
        				.equals(rhs.getComponent(i)));
        	}
        	return result;
    	}
}