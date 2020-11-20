package ua.skidchenko.registrationform.services;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import ua.skidchenko.registrationform.dto.UserDTO;

@Log4j2
@Service
public class UserServiceImpl implements UserService {
    public void printUserDTO(UserDTO userDTO) {
       log.info(userDTO);
    }

}
