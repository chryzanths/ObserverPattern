import java.util.List;

public class News implements NewsAgency
{
    private String newsCategory;
    private String newsUpdate;
    private List<User> userList;

    public String getNewsCategory() {
        return newsCategory;
    }

    public void setNewsCategory(String s) {
        this.newsCategory = newsCategory;
    }

    public String getNewsUpdate() {
        return newsUpdate;
    }

    public void setNewsUpdate(String s) {
        this.newsUpdate = newsUpdate;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public void join(User user) {
        userList.add(user);
    }

    @Override
    public void remove(User user) {
        userList.remove(user);
    }

    @Override
    public String notifyUser() {

        String output = new String();
        for (User user : userList)
        {
            output += "Hello, " + user.getUserName() +"!\n\n";
            output += getNewsCategory() + " has a latest news about " + getNewsUpdate() +"!\n\n";
        }
        return output;
    }
}
