package com.example.th2.service.role;

import com.example.th2.model.Role;
import com.example.th2.service.IGeneralService;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}