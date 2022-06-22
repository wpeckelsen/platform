package nl.wessel.platform.A.Controller;

import nl.wessel.platform.B.BusinessLogic.Exception.BadRequest;
import nl.wessel.platform.B.BusinessLogic.Exception.RecordNotFound;
import nl.wessel.platform.B.BusinessLogic.Exception.UsernameNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = RecordNotFound.class)
    public ResponseEntity<Object> exception(RecordNotFound exception) {

        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(value = BadRequest.class)
    public ResponseEntity<Object> badRequest(BadRequest bad){
        return new ResponseEntity<>(bad.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = UsernameNotFound.class)
    public ResponseEntity<Object> username(UsernameNotFound user){
        return new ResponseEntity<>(user.getMessage(), HttpStatus.NOT_FOUND);
    }

}