package SoritngClasses;

class Student {

	int id;
	String name;
	int marks[] = new int[5];

	public Student(int id, String name, int marks[]) {
		this.id = id;
		this.name = name;

		for (int i = 0; i < 5; i++) {
			this.marks[i] = marks[i];
		}
	}
}
