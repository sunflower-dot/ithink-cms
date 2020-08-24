package com.haan.myblog.controller;

import com.haan.myblog.domin.dto.MenuDto;
import com.haan.myblog.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lkhan
 */
@RestController
@RequestMapping("menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping("")
    public MenuDto create(@RequestBody MenuDto dto){
        return menuService.create(dto);
    }
}
