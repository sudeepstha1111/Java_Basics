import Headquarters.Headquarters;
import com.sun.tools.javac.Main;

import javax.imageio.stream.ImageInputStream;

public class Office {
  Department department;
  Employee employee;
  Officesupplies officeSupplies;
  Headquarters headquarters;

  public Office() {
  }
  public Office(Department department) {
    super();
    this.department = department;
  }

  public Office(Department department, Employee employee, Officesupplies officeSupplies, Headquarters headquarters) {
    super();
    this.department = department;
    this.employee = employee;
    this.officeSupplies = officeSupplies;
    this.headquarters = headquarters;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public Officesupplies getOfficeSupplies() {
    return officeSupplies;
  }

  public void setOfficeSupplies(Officesupplies officeSupplies) {
    this.officeSupplies = officeSupplies;
  }

  @Override
  public String toString() {
    return "Office[departmrnt=" + this.department + ", employee=" + this.employee + ", officesupplies=" + this.officeSupplies + "]";
  }
}