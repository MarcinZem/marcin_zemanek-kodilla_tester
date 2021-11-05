public class Grades {
    private int size;
    private int[] grades;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int get(int value) {
        if (this.size == 10) {
            return 10;
        }
        return value;
    }
    public int averageGrades() {
        this.grades =new int [10];
        int studentsGrades = grades.length;

        for (int i = 0; i < grades.length; i++) {
            return grades.length/this.size;
        }
        return studentsGrades;
    }

}
