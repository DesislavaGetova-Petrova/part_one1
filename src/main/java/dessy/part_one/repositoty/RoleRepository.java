package dessy.part_one.repositoty;

import dessy.part_one.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,String> {

   Optional<Role> findByName(String name);
   Optional<Role> findRoleByName(String name);
}
