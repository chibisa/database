package lesson5_3.modul;

public class Student {
    int sumCredit;
    String StudentID;
    int maxMark;
    int Credit;
    public Student() {
    }

    public Student( String studentID, int maxMark, int credit,int sumCredit) {
        this.sumCredit = sumCredit;
        StudentID = studentID;
        this.maxMark = maxMark;
        Credit = credit;
    }

    public int getSumCredit() {
        return sumCredit;
    }

    public void setSumCredit(int sumCredit) {
        this.sumCredit = sumCredit;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public int getMaxMark() {
        return maxMark;
    }

    public void setMaxMark(int maxMark) {
        this.maxMark = maxMark;
    }

    public int getCredit() {
        return Credit;
    }

    public void setCredit(int credit) {
        Credit = credit;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maxCredit=" + sumCredit +
                ", StudentID='" + StudentID + '\'' +
                ", maxMark=" + maxMark +
                '}';
    }
}
