package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Integer> userNumbers = new ArrayList<>();

    public List<Integer> enterNumbers(){
        userNumbers.clear();
        String console = Console.readLine(); // console => 이름 바꾸기
        for (int i = 0; i < console.length(); i++) {
            userNumbers.add(Integer.parseInt(console.substring(i, i + 1)));
        }
        return userNumbers;
    }
    public List<Integer> getUserNumbers() {
        return this.userNumbers;
    }
}
