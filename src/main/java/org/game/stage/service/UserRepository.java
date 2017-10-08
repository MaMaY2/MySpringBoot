package org.game.stage.service;

import org.game.stage.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Stiles on 2017/9/3.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrOtherString(String username, String otherString);
}
