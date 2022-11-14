package filemanager;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static final Map<String, User> usersByLogin = new HashMap<>();

    public static User getUserByCookies(Cookie[] cookies) {
        return usersByLogin.get(Cookies.getLoginCookie(cookies));
    }
    public static void addUser(User user) {
        usersByLogin.put(user.getLogin(), user);
    }
}
