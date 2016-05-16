package vams.repository;

import org.springframework.data.repository.CrudRepository;
import vams.model.Employee;

/**
 * Created by vicmejia on 12/05/16.
 */
public interface EmployeeRepository extends CrudRepository<Employee,Long> {


}
