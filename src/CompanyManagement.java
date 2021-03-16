import java.util.List;

public class CompanyManagement {
    public static void main(String[] args) {

        //Create instance
        EmployeeDAOImpl dao = EmployeeDAOImpl.getInstance();

        //display all employee date
        displayAllEmp(dao);
        //add new employee
        //addNewEmp(dao);

        //find employee my id
        findEmpBy(dao);

    }

    private static void findEmpBy(EmployeeDAOImpl dao) {
        Employee emp = dao.finById("EMP001");
        if (emp == null) {
            System.out.println(emp.toString());
        }
    }
    private static void addNewEmp(EmployeeDAOImpl dao) {
        Employee myEmp = new Employee("EMP004",
                "niparpon",
                "Lecturer",
                "niparpon.2541@gmail.com",
                20000.00);
        dao.addEmp(myEmp);
    }

    private static void displayAllEmp(EmployeeDAOImpl dao) {
        List<Employee> emp = dao.getAllEmp();
        System.out.println("Employee Data: ");
        for (Employee e:emp){
            System.out.println(e.toString());
        }
    }
}
