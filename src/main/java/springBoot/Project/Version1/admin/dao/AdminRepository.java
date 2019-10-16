package springBoot.Project.Version1.admin.dao;
import org.springframework.data.repository.CrudRepository;

import springBoot.Project.Version1.admin.bean.Admin;

public interface AdminRepository extends CrudRepository<Admin,Integer> {

}
