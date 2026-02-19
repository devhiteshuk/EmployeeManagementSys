package com.dhl.ems.user_service.mapper;

import com.dhl.ems.user_service.dto.AppUserDTO;
import com.dhl.ems.user_service.entities.AppUser;

public class AppUserMapper {

    public  static AppUserDTO toAppUserDTO(AppUser appUser) {
        if (appUser == null) {
            return null;
        }

        AppUserDTO appUserDTO = new AppUserDTO();
        appUserDTO.setId(appUser.getId());
        appUserDTO.setUsername(appUser.getUsername());
        appUserDTO.setPassword(appUser.getPassword());
        appUserDTO.setEmail(appUser.getEmail());
        appUserDTO.setRole(appUser.getRole());
        appUserDTO.setActive(appUser.isActive());

        return appUserDTO;
    }

    public static AppUser fromAppUserDTO(AppUserDTO appUserDTO) {
        if (appUserDTO == null) {
            return null;
        }

        AppUser appUser = new AppUser();
        appUser.setId(appUserDTO.getId());
        appUser.setUsername(appUserDTO.getUsername());
        appUser.setPassword(appUserDTO.getPassword());
        appUser.setEmail(appUserDTO.getEmail());
        appUser.setRole(appUserDTO.getRole());
        appUser.setActive(appUserDTO.isActive());

        return appUser;
    }
}
