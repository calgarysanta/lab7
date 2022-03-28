package ca.sait.lab7.services;

import ca.sait.lab7.dataaccess.RoleDB;
import ca.sait.lab7.models.Role;
import java.util.List;

/**
 *
 * @author YEON
 */
public class RoleService {
    private RoleDB roleDB = new RoleDB();
    
    public List<Role> getAll() throws Exception {
        List<Role> roles = roleDB.getAll();
        return roles;
    }

    public String getName(int roleId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}