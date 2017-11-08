package com.qianfeng.service;

import com.qianfeng.beans.Res;
import com.qianfeng.beans.Role;
;
import com.qianfeng.dao.RoleDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/16 0016.
 */
@Service
public class RoleService {
    @Resource
    private RoleDao rd;
    public List<Role> findAllRoles(Map<String,Integer> param){

    return rd.findAllRoles(param);
    }
    public void addRole(Role role){
       rd.addRole(role);

    }
public int count(){
       return rd.count();
}
    public void deleteRole(ArrayList<Integer> ids){

   rd.deleteRole(ids);
    }
    public void updateRole(Role role){
       rd.updateRole(role);
    }
   public List<Role> findAllRoles2(){
        rd.findAllRoles2();
        return rd.findAllRoles2();
   }
   @Transactional
    public  void fprole(Map<String ,Integer> data){
       rd.deleteId(data);
       rd.fprole(data);
    }
    public List<Res>findAllRes(){
        return rd.findAllRes();
    }
    @Transactional
    public void toRolePerms(Map<String, Object> data) {
        //删除角色的老权限
        rd.deleteOldPerms(data.get("rid"));
        //分配新权限
        rd.toRolePerms(data);
    }
}
