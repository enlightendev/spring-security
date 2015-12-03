package io.enlightendev.resourceserver.web.controller.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class SecuredOAuthPingController {

    /**
     * @return
     */
    @RequestMapping({"/api/oauth2/ping"})
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String ping(){
        return "oauth2 secured ping ok";
    }

}