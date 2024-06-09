package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.mkhungo.constants.CustomerURIConstants;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("customer-forgot-password")
@Slf4j
public class ForgotPasswordController {

    //reset password
    //sendEmail
}
