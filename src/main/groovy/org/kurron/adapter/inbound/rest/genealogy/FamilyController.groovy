package org.kurron.adapter.inbound.rest.genealogy

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * REST controller for the genealogy APIs.
 */
@Controller
@RequestMapping( value = "/families" )
class FamilyController {

    // POST for Location
    // { top-level family state }
    public ResponseEntity<Void> createFamily()
    {
        throw new UnsupportedOperationException( 'createFamily' )
    }

    // GET /families/{id}
    public ResponseEntity<Void> readFamily()
    {
        throw new UnsupportedOperationException( 'readFamily' )
    }

    // PUT /families/{id}
    // { state change }
    public ResponseEntity<Void> updateFamily()
    {
        throw new UnsupportedOperationException( 'updateFamily' )
    }

    // DELETE /families/{id}
    public ResponseEntity<Void> deleteFamily()
    {
        throw new UnsupportedOperationException( 'deleteFamily' )
    }

    @RequestMapping( method = RequestMethod.GET, produces = [ MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE ] )
    public ResponseEntity<String> currentType()
    {
        return new ResponseEntity<String>( Long.toHexString( System.currentTimeMillis() ) , HttpStatus.OK );
    }
}
