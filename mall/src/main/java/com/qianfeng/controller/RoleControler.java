package com.qianfeng.controller;

import com.qianfeng.beans.Res;
import com.qianfeng.beans.Role;
import com.qianfeng.beans.User;
import com.qianfeng.service.RoleService;
import com.qianfeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.applet.Main;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/16 0016.
 */
@RestController //constroller+responsebody
public class RoleControler {
    @Autowired
    private RoleService rs;

    @RequestMapping("findAllRolesForPage")
    public List<Role> findAllAccount(int page, int size) {
        Map<String, Integer> param = new HashMap<>();
        param.put("start", (page - 1) * size);
        param.put("size", size);
        System.out.println(rs.findAllRoles(param));
        return rs.findAllRoles(param);

    }

    @RequestMapping("total1")
    public int count() {
        return rs.count();

    }
//    @RequestMapping("addRole")
//    public  String addRole(Role role){
//       rs.addRole(role);
//        return "3";
//
//    }

    @RequestMapping("deleteRole")
    public String deleteUser(@RequestBody ArrayList<Integer> ids) {
        rs.deleteRole(ids);
        return "3";

    }

    @RequestMapping("updateRole")
    public String updateUser(Role role) {
        if (role.getId() == 0) {
            rs.addRole(role);
        } else {
            rs.updateRole(role);
        }
        return "3";
    }

    @RequestMapping("saverole")
    public String saveRole(int uid, int rid) {
        Map<String, Integer> data = new HashMap<>();
        data.put("uid", uid);
        data.put("rid", rid);
        rs.fprole(data);
        return "1";
    }

    @RequestMapping("findAllRoles")
    public List<Res> findAllRoles() {
        return rs.findAllRes();
    }

    @RequestMapping("toRolePerms")
    public String toRolePerms(@RequestBody ArrayList<Integer> ids) {
        Map<String, Object> data = new HashMap<>();
        data.put("rid", ids.get(0));
        ids.remove(0);
        data.put("resid", ids);
        rs.toRolePerms(data);
        System.out.println("hahahha");
        return "1";
    }

}
