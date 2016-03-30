public class Segment {
	private Vector Start, End;

	public Segment(Vector start, Vector end) {
		Start = start;
		End = end;
	}

	// Длина
	double len() {
		return (End.sub(Start)).len();
	}

	// Расстояние до точки
	double distanceTo(Vector point) {
		Vector a;
		// Если отрезок нулевой длины(точка)
		if (len() == 0) {
			return Start.sub(point).len();
		}
		a = End.sub(Start).multiply(1 / len());
		Vector b = point;
		b.sub(Start);
		double s = a.scalar(b);
		a = Start.add(a.multiply(s));
		s = a.sub(point).len();
		if (Start.sub(point).len() < End.sub(point).len()) {
			if (Start.sub(point).len() < s) {
				s = Start.sub(point).len();
			}
		} else {
			if (End.sub(point).len() < s)
				s = End.sub(point).len();
		}
		return s;
	}
}