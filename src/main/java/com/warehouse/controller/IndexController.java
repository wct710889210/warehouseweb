package com.warehouse.controller;

import com.warehouse.entity.Goods;
import com.warehouse.entity.User;
import com.warehouse.repository.GoodsRepository;
import com.warehouse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String index(Model model){
        List<Goods> goodses = goodsRepository.findAll();
        List<User> users = userRepository.findAll();
        model.addAttribute("goodses",goodses);
        model.addAttribute("users",users);
        return "index";
    }
}
