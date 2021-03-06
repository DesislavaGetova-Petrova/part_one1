package dessy.part_one.service;

import dessy.part_one.model.entity.Role;
import dessy.part_one.model.service.RoleServiceModel;

public interface RoleService {
    RoleServiceModel findByName(String name);

    Role findRoleByName(String name);
}
