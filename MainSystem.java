import java.util.ArrayList;
import java.util.List;

public class MainSystem
{
    public static void main(String[] args) {

        User chryzle = new User();
        chryzle.setUserName("Chryzle");

        User hoshi = new User();
        hoshi.setUserName("Hoshi");

        User mingyu = new User();
        mingyu.setUserName("Mingyu");

        List<User> userList = new ArrayList<>();
        userList.add(chryzle);
        userList.add(hoshi);
        userList.add(mingyu);

        News news = new News();
        news.setNewsCategory("Sports");
        news.setNewsUpdate("World Cup");
        news.setUserList(userList);

        System.out.println("Latest News!");
        System.out.println(news.notifyUser());

        news.remove(mingyu);

        User joshua = new User();
        joshua.setUserName("Joshua");
        news.join(joshua);

        news.setNewsCategory("Beauty");
        news.setNewsUpdate("Skincare Routine");

        System.out.println("News Update!");
        System.out.println(news.notifyUser());

    }
}
