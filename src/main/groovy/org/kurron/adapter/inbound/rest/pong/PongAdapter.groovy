package org.kurron.adapter.inbound.rest.pong

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * Simple controller to prove out that Groovy-based controllers can work.
 */
@Controller
@RequestMapping( value = "/pong" )
class PongAdapter {
    @RequestMapping( method = RequestMethod.GET, produces = "text/plain" )
    public ResponseEntity<String> currentType()
    {
        return new ResponseEntity<String>( Long.toHexString( System.currentTimeMillis() ) , HttpStatus.OK );
    }
}
