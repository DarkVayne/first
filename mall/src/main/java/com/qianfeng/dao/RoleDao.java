package com.qianfeng.dao;

import com.qianfeng.beans.Res;
import com.qianfeng.beans.Role;
import com.qianfeng.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/16 0016.
 */
@Repository
@Mapper
public interface RoleDao {
    public List<Role> findAllRoles(Map<String,Integer> param);
    public void addRole(Role role);
    public void deleteRole(Integer id);
    public void deleteRole(ArrayList<Integer> ids);
    public void updateRole(Role role );
    public  List<Role>  findAllRoles2();
    public void fprole(Map<String ,Integer> data);
    public void deleteId(Map<String ,Integer> data);
    public List<Res>findAllRes();
   public void toRolePerms(Map<String, Object> data);
    public void deleteOldPerms(Object rid);
    public int count();
}
