package homeWork.extra.dataBases.hr;

import homeWork.extra.youtube.stream.Data;

import java.util.Date;

public class Employees {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Date date;
    private String jobId;
    private double salary;
    private double commission;
    private int managerId;
    private int departmentId;

    public Employees() {
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", date=" + date +
                ", jobId='" + jobId + '\'' +
                ", salary=" + salary +
                ", commission=" + commission +
                ", managerId=" + managerId +
                ", departmentId=" + departmentId +
                '}';
    }
}
