package dev.decagon.ecommerce.service;

import dev.decagon.ecommerce.common.MessageStrings;
import dev.decagon.ecommerce.exceptions.AuthenticationFailException;
import dev.decagon.ecommerce.model.AuthToken;
import dev.decagon.ecommerce.model.User;
import dev.decagon.ecommerce.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthService {

    @Autowired
    TokenRepository repository;

    // save the confirmation token
    public void saveConfirmationToken(AuthToken authenticationToken) {
        repository.save(authenticationToken);
    }

    // get token of the User
    public AuthToken getToken(User user) {
        return repository.findTokenByUser(user);
    }

    // get Uer from the token
    public User getUser(String token) {
        AuthToken authenticationToken = repository.findTokenByToken(token);
        if (Objects.nonNull(authenticationToken)) {
            if (Objects.nonNull(authenticationToken.getUser())) {
                return authenticationToken.getUser();
            }
        }
        return null;
    }

    // check if the token is valid
    public void authenticate(String token) throws AuthenticationFailException {
        if (!Objects.nonNull(token)) {
            throw new AuthenticationFailException(MessageStrings.AUTH_TOKEN_NOT_PRESENT);
        }
        if (!Objects.nonNull(getUser(token))) {
            throw new AuthenticationFailException(MessageStrings.AUTH_TOKEN_NOT_VALID);
        }
    }
}
