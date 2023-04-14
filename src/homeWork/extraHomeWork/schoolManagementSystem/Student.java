package homeWork.extraHomeWork.schoolManagementSystem;

public class Student {
    private static int nextId = 1;
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = nextId++;
        this.name = name;
        this.grade = grade;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public void payFees(int fees){
        feesPaid += fees;
       School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                '}';
    }
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }
}
