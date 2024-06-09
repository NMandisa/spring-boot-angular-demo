package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("account")
@Slf4j
public class AccountController {
    @GetMapping("/verify-account") //sendVerificationEmail
    public ResponseEntity<?> verifyAccount (){
        return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
    }
    @GetMapping("/account-details")
    public ResponseEntity<?> accountDetails (){
        return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
    }
    @PatchMapping("/update-account-details")
    public ResponseEntity<?> updateAccountDetails (){
        return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
    }
}
