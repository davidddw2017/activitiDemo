package org.cloud.activiti.entity;

import java.util.List;

public class Role {
	private int rid;
	private String roleName;
	private String roleDesc;
	private List<UserRole> userRoles;
	private List<RolePermission> rolePermissions;
	
	public Role() {
	    
	}

	public Role(int rid, String roleName) {
        super();
        this.rid = rid;
        this.roleName = roleName;
    }

    public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	
	public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public List<RolePermission> getRolePermissions() {
		return rolePermissions;
	}

	public void setRolePermissions(List<RolePermission> rolePermissions) {
		this.rolePermissions = rolePermissions;
	}

    @Override
    public String toString() {
        return "Role [rid=" + rid + ", roleName=" + roleName + ", userRoles=" + userRoles
                + ", rolePermissions=" + rolePermissions + "]";
    }
}