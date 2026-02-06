// Create a class Student with:

// private rollNo

// private marks

// Rules:

// marks should not be more than 100

// If someone tries to set marks > 100, set it to 100

class Marks {
    private String name;
    private int marks;
    private String subjct;

    public void setname(String name) {
        this.name = name;

    }

    public String getname() {
        return name;
    }

    public void setmarks(int marks) {
        if (marks > 100) {
            this.marks = 100; // ✅ force set to 100
        } else if (marks < 0) {
            this.marks = 0; // optional safety
        } else {
            this.marks = marks;
        }
    }

    public int getmarks() {
        return marks;
    }

}
