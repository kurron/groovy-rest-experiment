package org.kurron.adapter.inbound.rest.ping;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Just to verify that the Spring MVC framework is properly wired up.
 */
@Controller
@RequestMapping( value = "/ping" )
public class PingAdapter {

    public PingAdapter() {
        System.err.println("PingAdapter constructed!");
    }

    @RequestMapping( method = RequestMethod.GET, produces = "text/plain" )
    public ResponseEntity<String> currentType()
    {
        return new ResponseEntity<String>( Long.toHexString( System.currentTimeMillis() ) , HttpStatus.OK );
    }
}
