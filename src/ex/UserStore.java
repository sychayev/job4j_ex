package ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        for(int i =0 ;i < users.length;i++){
           if(users[i].equals(login)){
               rsl=i;
               break;
           }
        }
        if(rsl == -1){
            throw new  UserNotFoundException();
        }
        return users[rsl];
    }

    public static boolean validate(User user)
            throws UserInvalidException {

        if(user.isValid()!=true){
            throw new UserInvalidException();
        }
        else if(user.getUsername().length()<3){
            throw new UserInvalidException();
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try{
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");}
        }catch( UserInvalidException e) {
            e.printStackTrace();
        }catch(UserNotFoundException us ) {
            us.printStackTrace();
        }
    }
}
