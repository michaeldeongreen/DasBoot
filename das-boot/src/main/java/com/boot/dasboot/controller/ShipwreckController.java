package com.boot.dasboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.boot.dasboot.model.Shipwreck;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list() {
        return ShipwreckStub.list();
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck) {
        return ShipwreckStub.create(shipwreck);
    }
    
    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
    public Shipwreck get(@PathVariable Long id) {
        return ShipwreckStub.get(id);
    }

    @RequestMapping(value="shipwrecks/{id}", method=RequestMethod.PUT)
    public Shipwreck requestMethodName(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
        return ShipwreckStub.update(id, shipwreck);
    }
    
    @RequestMapping(value="shipwrecks/{id}", method=RequestMethod.DELETE)
    public Shipwreck requestMethodName(@PathVariable Long id) {
        return ShipwreckStub.delete(id);
    }
    

}