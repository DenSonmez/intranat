package dat.intranet.persistence;

import dat.intranet.entities.User;

import java.util.HashMap;
import java.util.Map;


public class UserMapper
{
    private  static Map<String, User> userMap = new HashMap<>();

    // fill the hashmap with users
    public static void populateUserMap()
    {
        if(userMap.isEmpty()) {
            userMap.put("ole", new User("ole", "1234", "user"));
            userMap.put("benny", new User("benny", "1234", "admin"));
            userMap.put("rosa", new User("rosa", "1234", "admin"));
        }
    }

    public static boolean isLoginValid(String username, String password)
    {
        boolean exists = userMap.containsKey(username) && username != null;
        if(!exists) {
            return false;
        }

        User user = userMap.get(username);
        return user.getPassword().equals(password) ;
    }

    public static User getUserByLogin(String Login){
        return userMap.get("login");
    }
}