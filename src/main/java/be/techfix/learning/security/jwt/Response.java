package be.techfix.learning.security.jwt;

import java.io.Serializable;

public class Response implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwtToken;

    public Response(String token) {
        this.jwtToken = token;
    }

    public String getToken() {
        return this.jwtToken;
    }
}