import java.util.*;

class Student {
    private String studentName;
    private String department;
    
    Student(String studentName, String department) {
        this.studentName = studentName;
        this.department = department;
    }
}

class Department {
    private String departmentName;
    private List<Student> students;
    
    Department(String departmentName, List<Student> students) {
        this.departmentName = departmentName;
        this.students = students;
    }
    
    public List<Student> getStudents() {
        return students;
    }
}

class Institute {
    private String instituteName;
    private List<Department> departments;
    
    Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }
    
    public String getInstituteName() {
        return instituteName;
    }
    
    public int getTotalStudentsInInstitue() {
        int noOfStudents = 0;
        
        for(Department dept : departments) {
            List<Student> std = dept.getStudents();
            for(Student s : std) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}


class Aggregation {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul","CSE");
        Student s2 = new Student("kiran","Civil");
        Student s3 = new Student("Rohan","CSE");
        Student s4 = new Student("Suraj","CSE");
        Student s5 = new Student("Rajesh","Civil");
        
        List<Student> std1 = new ArrayList<>();
        std1.add(s1);
        std1.add(s3);
        std1.add(s4);
        
        List<Student> std2 = new ArrayList<>();
        std2.add(s2);
        std2.add(s5);
        
        Department dep1 = new Department("CSE",std1);
        Department dep2 = new Department("Civil",std2);
        
        List<Department> departments = new ArrayList<>();
        departments.add(dep1);
        departments.add(dep2);
        
        Institute institute = new Institute("NIT", departments);
        System.out.println("Total Number of Students in " + institute.getInstituteName() + " is: " + institute.getTotalStudentsInInstitue());
    }
}
